package Lekcija_13_Lambda_Izrazi.TryIt;

public class TestPayIncreaseLambda {

    public static void main(String[] args) {

        Person[] workers = new Person[4];

        workers[0] = new Person("John", percent -> {
            System.out.println("Increased payment by " + percent + "%.");
            return true;
        });

        workers[1] = new Person("Mary", percent -> {
            if (Payable.INCREASING_CAP < percent) {
                System.out.println("Sorry, can't increase hourly rate by more than " + Payable.INCREASING_CAP + "%.");
                return false;
            } else {
                System.out.println("Incresed hourly rate by " + percent + "%.");
                return true;
            }
        });

        workers[2] = new Person("Steve", percent -> {
            System.out.println("Increased payment by " + percent + "%.");
            return true;
        });
        workers[3] = new Person("Boris", percent -> {
            System.out.println("I'm a foreign worker");
            return true;
        });

        for (Person person : workers) {
            person.validatePayIncrease(person.getIncreasePayment(),30);
        }
    }
}
