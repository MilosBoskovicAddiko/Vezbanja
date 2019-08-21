package Lekcija_7_AbstractClasses_Interfaces.Interface;

public class Contractor implements Payable {

    private String name;

    public Contractor(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is " + name;
    }

    @Override
    public void increasePay(int percent) {
        System.out.println((percent < INCREASE_CAP ? "Increasing hourly rate by " + percent + "%. " + getName()
                : "Sorry, can't increase hourly rate by more than " + INCREASE_CAP + "%. " + getName()));
    }
}
