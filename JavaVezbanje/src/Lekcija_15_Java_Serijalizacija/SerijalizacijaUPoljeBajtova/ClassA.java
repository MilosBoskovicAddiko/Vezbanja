package Lekcija_15_Java_Serijalizacija.SerijalizacijaUPoljeBajtova;

import java.io.*;

public class ClassA {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.fName = "Milos";
        emp.lName = "Boskovic";
        emp.salary = 30000;

        try(ByteArrayOutputStream baOut = new ByteArrayOutputStream(5000);
        ObjectOutputStream oOut = new ObjectOutputStream(new BufferedOutputStream(baOut));) {

            oOut.writeObject(emp);
            oOut.flush();
            byte[] empAsByteArray = baOut.toByteArray();

            // Desirijalizacija iz polja bajtova radi kloniranja objekta
            ByteArrayInputStream baIn = new ByteArrayInputStream(empAsByteArray);
            ObjectInputStream oIn = new ObjectInputStream(baIn);
            Employee cloneOfEmp = (Employee) oIn.readObject();
            System.out.println(cloneOfEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
