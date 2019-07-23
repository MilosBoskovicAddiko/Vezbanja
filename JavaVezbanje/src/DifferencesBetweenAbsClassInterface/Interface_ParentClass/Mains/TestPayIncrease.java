package DifferencesBetweenAbsClassInterface.Interface_ParentClass.Mains;

import DifferencesBetweenAbsClassInterface.Interface_ParentClass.Contractor;
import DifferencesBetweenAbsClassInterface.Interface_ParentClass.Employee;
import DifferencesBetweenAbsClassInterface.Interface_ParentClass.Person;

public class TestPayIncrease {
    public static void main(String[] args) {
        Person workers[] = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");

        for(Person p : workers){
            if(p instanceof Employee){
                ((Employee)p).increasePay(30);
            }else if(p instanceof Contractor){
                ((Contractor)p).increasePay(30);
            }
        }
    }
}
