package DifferencesBetweenAbsClassInterface.Interface_ParentClass.Mains;

import DifferencesBetweenAbsClassInterface.Interface_ParentClass.*;

public class TestPayIncreasePolyError {
    public static void main(String[] args) {
        Payable workers[] = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new ForeignContractor("Boris");

        for(Payable p : workers){
            p.increasePay(30);
        }
    }
}
