package Lekcija_7.Interface;

public class Employee implements Payable {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is " + name;
    }

    @Override
    public void increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. " + getName());
    }
}
