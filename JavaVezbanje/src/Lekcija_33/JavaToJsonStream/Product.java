package Lekcija_33.JavaToJsonStream;

public class Product {

    public long id;
    public String description;
    public double price;

    public Product(long id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
