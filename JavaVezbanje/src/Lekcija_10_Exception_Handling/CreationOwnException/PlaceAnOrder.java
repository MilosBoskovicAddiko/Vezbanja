package Lekcija_10_Exception_Handling.CreationOwnException;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a model You want to order: ");
        String model = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        BikeOrder bikeOrder = new BikeOrder(model, quantity);

        try {
            bikeOrder.validateOrder();
        } catch (TooManyBikesException e) {
            e.printStackTrace();
        }
    }
}
