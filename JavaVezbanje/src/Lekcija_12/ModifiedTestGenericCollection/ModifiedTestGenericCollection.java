package Lekcija_12.ModifiedTestGenericCollection;

import Lekcija_12.TestGenericCollection.Customer;
import Lekcija_12.TestGenericCollection.Order;

import java.util.ArrayList;
import java.util.List;

public class ModifiedTestGenericCollection {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<Customer>();

        Customer customer1 = new Customer("David", "Lee");
        customers.add(customer1);
        Customer customer2 = new Customer("Ringo", "Starr");
        customers.add(customer2);
        Order order = new Order("Juice", 1);
        //customers.add(order); //greska pri kompajliranju

        // Pristupanje listi kupaca i izvrsavanje odredjene obrade
        // svakog elementa u ovoj kolekciji. Nije neophodno kastovanmje

        processData(customers);
    }

    /*private static void processData(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println("Trenutna musterija je: " + customer);
        }
    }*/

    //primer parametrizovane metode
    private static void processData(List<?> data){
        for (Object obj : data) {
            System.out.println("Trenutna musterija je: " + obj);
        }
    }


}
