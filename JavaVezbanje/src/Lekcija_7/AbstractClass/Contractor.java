package Lekcija_7.AbstractClass;

public class Contractor extends Person {

    public Contractor(String name) {
        super(name);
    }

    @Override
    public void increasePay(int percent) {
        System.out.println((percent < INCREASE_CAP ? "Increasing salary by " + percent + "%. " + getName()
                : "Sorry, can't increase hourly rate by more than " + INCREASE_CAP + "%. " + getName()));
    }
}
