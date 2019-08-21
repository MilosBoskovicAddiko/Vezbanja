package Lekcija_6_Paketi_Interfejsi_Enkapsulacija;

public class TestPayIncrease {
    public static void main(String[] args) {
        Person[] workers = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");

        Employee currentEmployee;
        Contractor currentContractor;

        for (Person person : workers) {
            if (person instanceof Employee) {
                currentEmployee = (Employee) person;
                currentEmployee.increasePay(30);
            } else if (person instanceof Contractor) {
                currentContractor = (Contractor) person;
                currentContractor.increasePay(30);
            }
        }
    }
}
