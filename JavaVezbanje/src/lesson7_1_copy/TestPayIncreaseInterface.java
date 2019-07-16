package lesson7_1_copy;

public class TestPayIncreaseInterface {
    public static void main(String[] args) {
        Payable workers[] = new Payable[4];

        workers[0] = new Employee("John");
        workers[1] = new Contractor("Mary");
        workers[2] = new Employee("Steve");


        for(Payable p : workers){
            p.increasePay(30);
        }

    }
}
