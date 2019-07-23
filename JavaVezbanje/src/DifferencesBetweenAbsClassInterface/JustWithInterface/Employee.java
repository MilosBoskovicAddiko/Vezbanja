package DifferencesBetweenAbsClassInterface.JustWithInterface;

public class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }


    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing payment by "+percent+"%. "+name);
        System.out.println("-----------------------------------------------------------");
        return true;
    }
}
