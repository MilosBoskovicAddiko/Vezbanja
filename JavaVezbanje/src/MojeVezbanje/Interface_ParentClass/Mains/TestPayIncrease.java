package MojeVezbanje.Interface_ParentClass.Mains;

import MojeVezbanje.Interface_ParentClass.Contractor;
import MojeVezbanje.Interface_ParentClass.Employee;
import MojeVezbanje.Interface_ParentClass.Person;

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
