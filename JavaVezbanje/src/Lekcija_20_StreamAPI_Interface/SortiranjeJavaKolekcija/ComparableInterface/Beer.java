package Lekcija_20_StreamAPI_Interface.SortiranjeJavaKolekcija.ComparableInterface;

public class Beer implements Comparable<Beer> {
    public String name;
    public String country;
    public float price;

    public Beer(String name, String country, float price) {
        this.name = name;
        this.country = country;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }

    @Override
    public int compareTo(Beer o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
