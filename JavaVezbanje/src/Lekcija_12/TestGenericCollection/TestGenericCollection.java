package Lekcija_12.TestGenericCollection;

import java.util.ArrayList;
import java.util.List;

public class TestGenericCollection {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("David", "Lee");
        customers.add(customer1);
        Customer customer2 = new Customer("Ringo", "Starr");
        customers.add(customer2);

        Order order = new Order("coffee", 2);
        //customers.add(order);   //greska pri kompajliranju
    }
}
