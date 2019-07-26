package Lekcija_12.ParameterizedClassExample;

import Lekcija_12.ParameterizedClassExample.Products.Products;

import java.util.ArrayList;
import java.util.List;

public class Ferry {

    private List<Truck<? extends Products>> load = new ArrayList<>();

    public void loadTruck(Truck<? extends Products> truck) {
        load.add(truck);
        System.out.println("Utovareni kamioni na trajekt: " + truck);
    }

    public void unloadToDocks(List<? extends Products> ferryTrucks, List<? super Products> dockTrucks) {
        for(Products products : ferryTrucks){
            dockTrucks.add(products);
        }
        System.out.println("Istovareno sa trajekta: " + dockTrucks);
    }

    @Override
    public String toString() {
        return "Ferry{" +
                "load=" + load +
                '}';
    }
}
