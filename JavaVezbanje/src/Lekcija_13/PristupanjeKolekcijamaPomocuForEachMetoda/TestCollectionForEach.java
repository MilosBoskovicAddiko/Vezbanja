package Lekcija_13.PristupanjeKolekcijamaPomocuForEachMetoda;

import java.util.Arrays;
import java.util.List;

public class TestCollectionForEach {

    public static void main(String[] args) {

        Person[] workers = new Person[3];
        workers[0] = new Person("John", 'E');
        workers[1] = new Person("Mary", 'C');
        workers[2] = new Person("Steve", 'E');

        List<Person> workerList = Arrays.asList(workers);

        // Imperativna petlja
        System.out.println("1. Running imperative loop");
        for (Person person : workerList) {
            if ('E' == person.getWorkerStatus()) {
                System.out.println(person.getName() + " is employee");
            } else if ('C' == person.getWorkerStatus()) {
                System.out.println(person.getName() + " is contractor");
            }
        }

        // Funkcionalna petlja
        System.out.println("2. Running functional loop");
        workerList.forEach(person -> {
            if ('E' == person.getWorkerStatus()) {
                System.out.println(person.getName() + " is employee");
            } else if ('C' == person.getWorkerStatus()) {
                System.out.println(person.getName() + " is contractor");
            }
        });
    }
}
