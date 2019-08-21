package Lekcija_20_StreamAPI_Interface.SortiranjeJavaKolekcija.ComparatorInterface;

public class Beer{
    public String name;
    public String country;
    public float price;

    public Beer(String name, String country, float price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }
}
