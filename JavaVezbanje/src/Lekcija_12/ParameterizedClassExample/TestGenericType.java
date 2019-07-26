package Lekcija_12.ParameterizedClassExample;

import Lekcija_12.ParameterizedClassExample.Products.Bike;
import Lekcija_12.ParameterizedClassExample.Products.Products;
import Lekcija_12.ParameterizedClassExample.Products.Wheel;

import java.util.List;

public class TestGenericType {

    public static void main(String[] args) {
        Ferry ferry = new Ferry();
        Truck<Products> shipment = new Truck<>();
        Bike bike = new Bike("BMX-500", 100.);
        Wheel wheel = new Wheel(50.,30.);

        shipment.add(bike);
        shipment.add(wheel);

        List<Products> loaded = shipment.getProducts();
        System.out.println("Utovarena roba na kamionu: " + loaded);


        ferry.loadTruck(shipment);
        ferry.unloadToDocks();




    }
}
