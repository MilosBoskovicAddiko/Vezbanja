package Lekcija_15_Java_Serijalizacija.ExtrenalizableInterface;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassBExternalization {

    public static void main(String[] args) {

        try (FileInputStream fIn = new FileInputStream("EmployeeExternalization.ser");
             ObjectInputStream oIn = new ObjectInputStream(fIn);) {

            Employee employee = new Employee();
            employee.readExternal(oIn);

            System.out.println(employee);

            System.out.println("Deserialized object with id = " + employee.id);
            System.out.printf("Salary = $%.2f", employee.salary);

        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }
}
