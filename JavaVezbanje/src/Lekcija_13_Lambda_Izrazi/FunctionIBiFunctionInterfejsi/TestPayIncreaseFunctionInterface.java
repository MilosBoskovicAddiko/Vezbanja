package Lekcija_13_Lambda_Izrazi.FunctionIBiFunctionInterfejsi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class TestPayIncreaseFunctionInterface {

    public static void main(String[] args) {

        final int INCREASE_CAP = 20; // ogranicenje za povecanje plate izrazeno u %
        int proposedIncrease = 30; // procenat

        Person[] workers = new Person[3];
        workers[0] = new Person("John", 'E');
        workers[1] = new Person("Mary", 'C');
        workers[2] = new Person("Steve", 'E');

        List<Person> workersList = Arrays.asList(workers);

        // Definisanje funkcije sa dva argumenta, Person i procenat
        // koja vraca boolean vrednost

        // Lambda izraz za povecanje plate zaposlenog
        BiFunction<Person, Integer, Boolean> increaseRulesEmployees = ((person, percent) -> {
            System.out.println("Increasing pay by " + percent + "% for " + person.getName());
            return true;
        });

        // Lambda izraz za povecanje honorara za honorarnog radnika
        BiFunction<Person, Integer, Boolean> increaseRulerContractor = ((person, percent) -> {
            if (percent > INCREASE_CAP) {
                System.out.println("Sorry, can't increase hourly rate by more than " + INCREASE_CAP + "% for " + person.getName());
                return false;
            } else {
                System.out.println("Increasing hourly rate by " + percent + "% for " + person.getName());
                return true;
            }
        });

        // Validacija povecanja plate
        workersList.forEach(person -> {
            if ('E' == person.getWorkerStatus()) {
                person.validateIncreasePay(increaseRulesEmployees, proposedIncrease);
            } else if ('C' == person.getWorkerStatus()) {
                person.validateIncreasePay(increaseRulerContractor, proposedIncrease);
            }
        });
    }
}
