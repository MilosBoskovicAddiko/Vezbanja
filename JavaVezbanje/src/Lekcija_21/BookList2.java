package Lekcija_21;

import java.sql.*;
import java.util.ArrayList;

public class BookList2 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        String sqlQuery = "select * from books";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library1", "root", "root"); Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlQuery);){

            while (rs.next()) {
                Book currentBook = new BookList2(). new Book();
                currentBook.id = rs.getLong("id");
                currentBook.author = rs.getString("author");
                currentBook.title = rs.getString("title");
                currentBook.published = rs.getString("published");
                currentBook.publisher = rs.getString("publisher");

                books.add(currentBook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        books.forEach(System.out::println);

    }

    public class Book {
        private Long id;
        private String author, title, publisher, published;

        public Book() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getPublished() {
            return published;
        }

        public void setPublished(String published) {
            this.published = published;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", published='" + published + '\'' +
                    '}';
        }
    }
}
