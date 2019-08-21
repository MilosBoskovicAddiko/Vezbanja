package Lekcija_13_Lambda_Izrazi.TestPayIncreaseLambda;

public class Person {

    private String name;
    private char workerStatus; //'E' for Employee : 'C' for Contractor

    public Person(String name, char workerStatus) {
        this.name = name;
        this.workerStatus = workerStatus;
    }

    public String getName() {
        return name;
    }

    public char getWorkerStatus() {
        return workerStatus;
    }

    public boolean validatePayIncrease(Payable increaseFuncition, int percent){
        boolean isIncreaseValid = increaseFuncition.increasePay(percent);
        System.out.println("Increase pay for " + name + " is " + (isIncreaseValid ? "valid" : "not valid"));
        return isIncreaseValid;
    }
}
