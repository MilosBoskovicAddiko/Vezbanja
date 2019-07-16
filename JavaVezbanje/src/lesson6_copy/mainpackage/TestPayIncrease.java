package lesson6_copy.mainpackage;


import lesson6_copy.Contractor;
import lesson6_copy.Employee;
import lesson6_copy.Payable;

public class TestPayIncrease {
    public static void main(String[] args) {
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");

        Employee currentEmployee;
        Contractor currentContractor;

        for(Payable p : workers){
            if(p instanceof Employee){
                currentEmployee = (Employee) p;
                currentEmployee.increasePay(30);
            }else if(p instanceof  Contractor){
                currentContractor = (Contractor) p;
                currentContractor.increasePay(30);
            }
        }
    }
}
