package com.milos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/shoppingcart"}, name = "ShoppingCartServlet")
public class ShoppingCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();

        for (int i = 0; i < cookies.length; i++) {
            Cookie currentCookie = cookies[i];
            String name = currentCookie.getName();
            String value = currentCookie.getValue();

            System.out.println("received the cookie " + name + " = " + value);
        }

        // Preuzimanje ili kreiranje objekta sesije
        HttpSession session = request.getSession();

        // Pristupanje narudzbenici
        ArrayList<Book> myShoppingCart = (ArrayList<Book>) session.getAttribute("shoppingCart");

        if (myShoppingCart == null) {
            //Ovo je prvi poziv - kreiranje instance narudzbenice
            myShoppingCart = new ArrayList<>();
        }

        // Kreiranje objekta knjige na osnovu unetih parametara
        Book selectedBook = new Book();
        selectedBook.title = request.getParameter("booktitle");
        selectedBook.price = Double.parseDouble(request.getParameter("price"));

        // Dodavanje knjige u narudzbenicu
        myShoppingCart.add(selectedBook);

        // Postavljanje naruzdbenici nazad u objekat sesije
        session.setAttribute("shoppingCart", myShoppingCart);

        // Priprema web stranice i slanje u pregledac
        PrintWriter out = response.getWriter();

        // Dodavanje sadrzaja narudzebenice na web stranicu
        out.println("<body> Your shopping cart content: ");
        myShoppingCart.forEach(book -> out.printf("<br>Title: %s, price: %.2f", book.title, book.price));

        if (request.getParameter("placeorder") != null) {
            session.invalidate();
        }

        // Doadavanje html forme na web staranicu
        out.println("<p>Add another book to the shopping cart:");
        out.println("<form action=shoppingcart method=Get>"); // DODAJ ACTIOON
        out.println("<input type=Text name=booktitle>");
        out.println("<input type=Text name=price>");
        out.println("<input type=Submit value='Add to shopping cart'>");
        out.println("<br><input type=Submit value='Place oreder' name=placeorder>");
        out.println("</form>");
        out.println("</body>");

    }
}
