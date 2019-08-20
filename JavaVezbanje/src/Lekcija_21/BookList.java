package Lekcija_21;
import java.sql.*;

public class BookList {
    public static void main(String[] args) {

        String sqlQuery = "select * from books";
        //Uspostavljamo konekciju koja se moze automatski zatvarati, definisati naredbu i ocitati rezultat
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library1","root","root");Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery);){
            // Obraditi svaku kolonu rezultujuceg skupa i prikazati podatke
            while (rs.next()) {
                int bookNo = rs.getInt("id");
                String bookAuthor = rs.getString("author");
                String bookTitle = rs.getString("title");
                String bookPublisher = rs.getString("publisher");
                String bookPublished = rs.getString("published");
                System.out.println("BookId: " + bookNo +"\nAuthor: " + bookAuthor + "\nTitle: " + bookTitle +
                        "\nPublisher: " + bookPublisher + "\nPublished: " + bookPublished);
            }

            String sqlQuery1 = "insert into books (author, title, publisher, published) values (\"Joan Rowling\",\"Goblet of Fire\",\"Laguna\",\"2010\")";
            stmt.executeUpdate(sqlQuery1);
        } catch (SQLException se) {
            System.out.println("SQLError: " + se.getMessage() + "\nCode: " + se.getErrorCode());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
