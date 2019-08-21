package Lekcija_12_Genericki_Tipovi.ParameterizedClassExample.Products;

public class Bike extends Products{
    private String model;
    private double price;

    public Bike(String model, Double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
