package lesson7_copy;

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
        increasePay(percent);
        System.out.println("---------------------------------------------------------------------------");
    }
    //apstraktni metod implementiramo u izvedenim klasama
    public abstract boolean increasePay(int percent);
}
