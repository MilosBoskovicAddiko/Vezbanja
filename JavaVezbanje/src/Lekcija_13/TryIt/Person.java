package Lekcija_13.TryIt;

public class Person {

    private String name;
    private Payable increasePayment;

    public Person(String name, Payable increasePayment) {
        this.name = name;
        this.increasePayment = increasePayment;
    }

    public String getName() {
        return "Person's name is " + name;
    }

    public Payable getIncreasePayment() {
        return increasePayment;
    }

    public boolean validatePayIncrease(Payable increaseFunction, int percent) {
        boolean isIncreaseValid = increaseFunction.increasePay(percent);
        System.out.println("Increasing pay for " + name + " is " + (isIncreaseValid ? "valid" : "not valid"));
        return isIncreaseValid;
    }
}
