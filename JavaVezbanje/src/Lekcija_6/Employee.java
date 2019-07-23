package Lekcija_6;

public class Employee extends Person implements Payable {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. " + getName());
    }
}
