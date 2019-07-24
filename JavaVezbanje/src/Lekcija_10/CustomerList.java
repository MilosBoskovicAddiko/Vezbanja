package Lekcija_10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CustomerList {
    public void getAllCustomers() throws IOException {
        //Odredjeni kod se postavlja ovde

        //Ne koristite try/catch ukoliko ne rukujete izuzertcima ovde
        FileReader file = new FileReader("customers");
        file.read();
    }

    public static void main(String[] args) {
        System.out.println("Customer List");

        //Odredjeni kod se postavlja ovde

        try {
            //Posto je getAllCustomers() metod deklarisao izuzetak
            //ili se ovde rukuje njime ili se prosledjuje
            //pogledati objasnjenje klucne reci *throw*
            CustomerList customerList = new CustomerList();
            customerList.getAllCustomers();
        } catch (IOException ioe) {
            System.out.println("Customer list is not available");
        }
    }
}
