package Lekcija_13_Lambda_Izrazi.FunctionIBiFunctionInterfejsi;

import java.util.function.BiFunction;

public class Person {

    private String name;
    private char workerStatus; // 'E' or 'C'

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

    public boolean validateIncreasePay(BiFunction<Person, Integer, Boolean> function, int percent) {
        boolean isIncreaseValid = function.apply(this, percent);
        System.out.println("Increasing pay is " + (isIncreaseValid ? "valid" : "not valid"));
        return isIncreaseValid;
    }
}
