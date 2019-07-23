package DifferencesBetweenAbsClassInterface.AbstractClass;

public abstract class Person {
    private String name, address;
    int INCREASE_CAP = 20;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "Person's name is "+name;
    }

    public void changeAddress(String address) {
        this.address = address;
        System.out.println("New address is "+address);
    }

    private void giveDayOff(){
        System.out.println("Giving a day off to "+name);
    }

    public void promote(int percent){
        System.out.println("Promoting a worker..."+name);
        giveDayOff();
        increasePayment(percent);
        System.out.println("---------------------------------------------------------------------------");
    }

    public abstract boolean increasePayment(int percent);

    public static class TestPayIncrease {
        public static void main(String[] args) {
            Person workers[] = new Person[3];
            workers[0]=new Employee("John");
            workers[1]=new Contractor("Mary");
            workers[2]=new Employee("Steve");

            for(Person p : workers){
                p.increasePayment(30);

            }
        }
    }
}
