package Lekcija_20_StreamAPI_Interface.SortiranjeTokova;

public class Beer {
    public String name;
    public String country;
    public float price;

    public Beer(String name, String country, float price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Country: " + country + ", Name: " + name + ", Price: " + price;
    }
}
