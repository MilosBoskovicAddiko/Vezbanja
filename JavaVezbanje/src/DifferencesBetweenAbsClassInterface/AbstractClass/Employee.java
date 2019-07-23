package DifferencesBetweenAbsClassInterface.AbstractClass;

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    @Override
    public boolean increasePayment(int percent) {
        System.out.println("Increasing payment by " + percent + "%. " + getName());
        System.out.println("---------------------------------------------------------------------------");
        return true;
    }
}
