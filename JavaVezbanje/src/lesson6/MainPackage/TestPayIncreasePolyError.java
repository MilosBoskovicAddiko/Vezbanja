package lesson6.MainPackage;

import lesson6.Contractor;
import lesson6.Employee;
import lesson6.ForeignContractor;
import lesson6.Payable;

public class TestPayIncreasePolyError {
    public static void main(String[] args) {
        Payable[] workers = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new ForeignContractor("Boris");

        for(Payable p: workers){
            p.increasePay(30);
        }
    }
}
