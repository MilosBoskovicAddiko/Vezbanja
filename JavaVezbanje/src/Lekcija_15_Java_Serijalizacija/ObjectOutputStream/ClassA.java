package Lekcija_15_Java_Serijalizacija.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassA {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.fName = "John";
        employee.lName = "Smith";
        employee.salary = 50000;

        try (FileOutputStream fOut = new FileOutputStream("BestEmployee.ser");
             ObjectOutputStream oOut = new ObjectOutputStream(fOut)) {

            oOut.writeObject(employee); // serijalizacija objekta Employee
            oOut.flush();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("Employee object has been serialized into BestEmployee.ser");
    }
}
