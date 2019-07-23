package MojeVezbanje.Interface_ParentClass;

public class Employee extends Person implements Payable{
    public Employee(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Salary increased by "+percent+"%. "+getName());
        System.out.println("---------------------------------------------------------------------------");
        return true;
    }
}
