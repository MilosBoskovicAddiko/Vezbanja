package lesson6_copy.mainpackage;


import lesson6_copy.Contractor;
import lesson6_copy.Employee;
import lesson6_copy.ForeignContractor;
import lesson6_copy.Payable;

public class TestPayIncreasePolyError {
    public static void main(String[] args) {
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new ForeignContractor("Boris");

        for (Payable p : workers) {
            p.increasePay(30);
        }
    }
}
