package Lekcija_7_AbstractClasses_Interfaces.AbstractClass;

public class Employee extends Person {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. " + getName());
    }
}
