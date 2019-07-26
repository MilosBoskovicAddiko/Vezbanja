package Lekcija_12.ParameterizedClassExample;

import Lekcija_12.ParameterizedClassExample.Products.Bike;
import Lekcija_12.ParameterizedClassExample.Products.Products;
import Lekcija_12.ParameterizedClassExample.Products.Wheel;

import java.util.ArrayList;
import java.util.List;

public class TestGenericType {

    public static void main(String[] args) {
        Ferry ferry = new Ferry();

        Truck<Bike> bikes = new Truck<>();
        Bike bike = new Bike("BMX-500", 100.);
        Bike bike1 = new Bike("BMC-400", 80.);
        bikes.add(bike);
        bikes.add(bike1);

        Truck<Wheel> wheels = new Truck<>();
        Wheel wheel = new Wheel(50.,30.);
        Wheel wheel1 = new Wheel(40., 20.);
        wheels.add(wheel);
        wheels.add(wheel1);

        List<Bike> loadedBikes = bikes.getProducts();
        List<Wheel> loadedWheels = wheels.getProducts();
        System.out.println("Utovarene bicikle na kamionu: " + loadedBikes);
        System.out.println("Utovareni tockovi na kamionu: " + loadedWheels);


        ferry.loadTruck(bikes);
        ferry.loadTruck(wheels);

        List<Products> unloadingBikes = new ArrayList<>();
        List<Products> unloadingWheels = new ArrayList<>();

        ferry.unloadToDocks(loadedBikes, unloadingBikes);
        ferry.unloadToDocks(loadedWheels, unloadingWheels);






    }
}
