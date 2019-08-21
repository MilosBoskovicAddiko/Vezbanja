package Lekcija_7_AbstractClasses_Interfaces.AbstractClass;

public abstract class Person {
    private String name;
    private String address;

    final int INCREASE_CAP = 20; //ogranicenje povecanja zarade

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is " + name;
    }

    public void changeAddress(String address) {
        this.address = address;
        System.out.println("New address is " + address);
    }

    private void giveDayOff() {
        System.out.println("Giving a day off to " + name);
    }

    public void promote(int percent) {
        System.out.println("Promoting a worker...");
        giveDayOff();
        //pozivanje abstraktnog metoda
        increasePay(percent);
    }

    public abstract void increasePay(int percent);
}
