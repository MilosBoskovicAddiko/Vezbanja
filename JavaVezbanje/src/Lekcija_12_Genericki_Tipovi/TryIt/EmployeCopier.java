package Lekcija_12_Genericki_Tipovi.TryIt;

import java.util.LinkedList;
import java.util.List;

public class EmployeCopier {

    public static void copyEmployees(List<? extends Employee> from, List<? super Employee> to) {
        for (Employee employee : from) {
            to.add(new Employee(employee.getName()));
        }
    }

    public static void main(String[] args) {

        // kreiranje liste penzionera
        List<RetiredEmployee> retiredEmployees = new LinkedList<>();

        // popunjavanje liste penzionera
        retiredEmployees.add(new RetiredEmployee("Alex Smith", 50000.00));
        retiredEmployees.add(new RetiredEmployee("Mary Lou", 90000.00));
        retiredEmployees.add(new RetiredEmployee("Sam Adams", 70000.00));

        // kreiranje prazne Employee liste
        List<Employee> employees = new LinkedList<>();

        // pozivanje pomocne funkcije za kopiranje
        copyEmployees(retiredEmployees, employees);

        // prikaz
        System.out.println("Kopirani zaposlenici: ");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}
