package Lekcija_23_Anotacije_Refleksija.HRBrowser;

public class Book {

    private long id;
    private String author, title, published, publisher;

    public Book(long id, String author, String title, String published, String publisher) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.published = published;
        this.publisher = publisher;
    }

    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", published='" + published + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
