package lesson6.MainPackage;


import lesson6.Contractor;
import lesson6.Employee;
import lesson6.Payable;

public class TestPayIncrease {
    public static void main(String[] args) {
        //Person[] workers = new Person[3];
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");

        Employee currentEmployee;
        Contractor currentContractor;

        /*for (Person p : workers) {
            if (p instanceof Employee) {
                currentEmployee = (Employee) p;
                currentEmployee.increasePay(30);
            } else {
                currentContractor = (Contractor) p;
                currentContractor.increasePay(30);
            }
        }*/

        for(Payable p : workers){
            p.increasePay(30);
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
