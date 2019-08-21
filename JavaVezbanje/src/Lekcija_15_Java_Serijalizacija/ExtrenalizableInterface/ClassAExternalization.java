package Lekcija_15_Java_Serijalizacija.ExtrenalizableInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
//TODO - zasto ne radi externalizacija kada je sve kao u knjizi. Cita iz fajla, ali ocigledno ne ono sto bi trebalo
public class ClassAExternalization {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.fName = "John";
        employee.lName = "Smith";
        employee.salary = 50000.;
        employee.address = "12 main street";
        employee.hireDate = new Date();
        employee.id = 123;

        try (FileOutputStream fOut = new FileOutputStream("EmployeeExternalization.ser");
             ObjectOutputStream oOut = new ObjectOutputStream(fOut);) {

            employee.writeExternal(oOut); // Eksternalizacija objekta zaposlenog
            System.out.println("An employee is externalized into EmployeeExternalization.ser");
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }
}
