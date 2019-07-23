package Lekcija_7.Interface;

public class TestPayIncreaseInterface {
    public static void main(String[] args) {
        Payable[] workers = new Payable[3];
        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");

        for(Payable p : workers){
            p.increasePay(30);
        }
    }
}
