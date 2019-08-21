package Lekcija_12_Genericki_Tipovi.ParameterizedClassExample.Products;

public class Wheel extends Products{
    private double diameter, price;

    public Wheel(double diameter, double price) {
        this.diameter = diameter;
        this.price = price;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", price=" + price +
                '}';
    }
}
