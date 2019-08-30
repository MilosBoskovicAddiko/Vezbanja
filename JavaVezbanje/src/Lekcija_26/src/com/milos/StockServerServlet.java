package com.milos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/pricequote")
public class StockServerServlet extends HttpServlet {
    private StockQuoteGenerator stockQuoteGenerator = new StockQuoteGenerator();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String symbol = request.getParameter("symbol");
        String price = stockQuoteGenerator.getPrice(symbol);


        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.println("<html><body>");
        out.println("<h3>Requested symbol: " + symbol + "</h3>");
        out.println("<h3>Price: " + price + "</h3>");
        out.println("</body></html>");

    }
}
