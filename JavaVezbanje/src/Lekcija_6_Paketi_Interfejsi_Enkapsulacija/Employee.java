package Lekcija_6_Paketi_Interfejsi_Enkapsulacija;

public class Employee extends Person implements Payable {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. " + getName());
    }
}
