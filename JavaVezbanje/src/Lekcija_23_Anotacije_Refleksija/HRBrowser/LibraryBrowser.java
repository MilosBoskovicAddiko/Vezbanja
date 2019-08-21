package Lekcija_23_Anotacije_Refleksija.HRBrowser;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@MyJDBCExecutor(sqlStatement = "select * from books")
public class LibraryBrowser {

    public static List<Book> getBooks() throws ClassNotFoundException {
        List<Book> books = new ArrayList<>();

        Class classForIntrospection = Class.forName("Lekcija_23_Anotacije_Refleksija.HRBrowser.LibraryBrowser");
        MyJDBCExecutor myJDBCExecutor = (MyJDBCExecutor) classForIntrospection.getAnnotation(MyJDBCExecutor.class);

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library1", "root", "root");
             Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(myJDBCExecutor.sqlStatement())) {
            while (resultSet.next()) {
                Book book = new Book();
                book.setId(resultSet.getLong("id"));
                book.setTitle(resultSet.getString("title"));
                book.setAuthor(resultSet.getString("author"));
                book.setPublisher(resultSet.getString("publisher"));
                book.setPublished(resultSet.getString("published"));

                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public static void main(String[] args) throws ClassNotFoundException {

        List<Book> bookList = LibraryBrowser.getBooks();
        bookList.forEach(System.out::println);

    }
}
