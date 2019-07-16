package lesson7_copy;

public class TestPayIncrease {
    public static void main(String[] args) {
        Person workers[] = new Person[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Marry");
        workers[2] = new Employee("Steve");

        for(Person p:workers){
            p.promote(30);
        }
    }
}
