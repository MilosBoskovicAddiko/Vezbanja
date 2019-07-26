package Lekcija_12.ParameterizedClassExample;

import java.util.ArrayList;
import java.util.List;

public class Truck<T> {

    private List<T> products = new ArrayList<>();

    // Utovar proizvoda u kamion
    public void add(T t) {
        products.add(t);
    }

    // Vracanje proizvoda utovarenih u kamion
    public List<T> getProducts() {
        return products;
    }
}
