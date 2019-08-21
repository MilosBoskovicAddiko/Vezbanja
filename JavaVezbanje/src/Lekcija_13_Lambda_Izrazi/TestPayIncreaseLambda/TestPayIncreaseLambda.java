package Lekcija_13_Lambda_Izrazi.TestPayIncreaseLambda;

public class TestPayIncreaseLambda {

    public static void main(String[] args) {

        Person[] workers = new Person[3];
        workers[0] = new Person("John", 'E');
        workers[1] = new Person("Mary", 'C');
        workers[2] = new Person("Steve", 'E');

        // Lambda izraz za povecanje plate zaposlenog
        Payable increaseRulesEmployee = (int percent) -> {
            return true;
        };

        // Lambda izraz za povecanje plate honorarnog radnika
        Payable increaseRulesContractor = (percent -> {
            if (percent > Payable.INCREASE_CAP) {
                System.out.println("Sorry, can't increase hourly rate by more than " + Payable.INCREASE_CAP + "%. ");
                return false;
            } else {
                return true;
            }
        });

        for (Person person : workers) {
            if ('E' == person.getWorkerStatus()) {
                // Validacija povecanja od 30% za nsvakog radnika
                person.validatePayIncrease(increaseRulesEmployee, 30);
            } else if ('C' == person.getWorkerStatus()) {
                person.validatePayIncrease(increaseRulesContractor, 30);
            }
        }
    }
}
