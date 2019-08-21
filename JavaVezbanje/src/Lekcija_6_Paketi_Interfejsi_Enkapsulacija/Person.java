package Lekcija_6_Paketi_Interfejsi_Enkapsulacija;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is " + name;
    }
}
