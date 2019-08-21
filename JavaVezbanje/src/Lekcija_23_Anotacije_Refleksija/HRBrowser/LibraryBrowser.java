package Lekcija_23_Anotacije_Refleksija.HRBrowser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryBrowser {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MyJDBCExecutor {
        String sqlStatement();
    }

    @MyJDBCExecutor(sqlStatement = "select * from books")
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql:://localhost:3306/library1", "root", "root");
             Statement statement = connection.createStatement(); /*ResultSet resultSet = statement.executeQuery(MyJDBCExecutor::sqlStatement)*/){

            //
            //
            //
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}
