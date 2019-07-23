package Lekcija_7.AbstractClass;

public class TestPayIncrease {
    public static void main(String[] args) {
        Person[] workers = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");

        for(Person person : workers){
            person.promote(30);
        }

    }
}
