package lesson7_1_copy;

public class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by "+percent+"%. "+name);
        return true;
    }
}
