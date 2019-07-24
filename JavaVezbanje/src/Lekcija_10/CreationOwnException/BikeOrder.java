package Lekcija_10.CreationOwnException;

public class BikeOrder {
    private String model;
    private int quantity;
    private final int maxQuantity = 20;

    public BikeOrder(String model, int quantity) {
        this.model = model;
        this.quantity = quantity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void validateOrder() throws TooManyBikesException {
        if (quantity <= maxQuantity) {
            System.out.println("Order is valid. Expect your order for at most 10 days from today.");
        } else {
            throw new TooManyBikesException("Cannot ship more than " + maxQuantity + " bikes of model " + model);
        }
    }
}
