package Lekcija_12_Genericki_Tipovi.TestGenericCollection;

public class Order {

    private String product;
    private int quatity;

    public Order(String product, int quatity) {
        this.product = product;
        this.quatity = quatity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", quatity=" + quatity +
                '}';
    }
}
