package Lekcija_15.ObjectInputStream;

import Lekcija_15.ObjectOutputStream.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassB {

    public static void main(String[] args) {

        try (FileInputStream fIn = new FileInputStream("BestEmployee.ser");
             ObjectInputStream oIn = new ObjectInputStream(fIn);) {

            Employee bestEmployee =  (Employee) oIn.readObject();
            System.out.println(bestEmployee.fName);
            System.out.println(bestEmployee.lName);
            System.out.println(bestEmployee.salary); // It's zero 'cause field salary hasn't been serialized

        } catch (IOException | ClassNotFoundException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("The Employee object has been deserialized.");
    }
}
