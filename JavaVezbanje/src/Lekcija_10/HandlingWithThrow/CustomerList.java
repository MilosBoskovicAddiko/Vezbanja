package Lekcija_10.HandlingWithThrow;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomerList {

    public void getAllCustomers() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Milos Boskovic\\Documents\\Vezbanja\\JavaVezbanje\\src\\Lekcija_10\\HandlingWithThrow\\customerList"));
        try {
            String line;
            int no = 1;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(no++ + ". " + line);
            }

        } catch (IOException ioe) {
            //Logovati ovde gresku, a zatim generistai novi izuzetak
            //sa samostalno definisanim opisom
            throw new Exception("Customer list is not available! " + ioe.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Customer List:");
        CustomerList customerList = new CustomerList();
        try {
            //Posto getAllCustomers() metod deklarise izuzetak,
            //mozemo da rukujemo sa izuzetkom. Prosledjivanje je moguca opcija
            //ukoliko se vec ne nalazimo u main(0 metodi
            customerList.getAllCustomers();
        } catch (Exception e) {
            System.out.println("Customer list is not available! " + e.getMessage());
        }

    }

}
