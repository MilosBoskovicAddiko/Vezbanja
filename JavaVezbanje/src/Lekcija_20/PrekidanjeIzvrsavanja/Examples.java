package Lekcija_20.PrekidanjeIzvrsavanja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public class Examples {
    public static void main(String[] args) {
        // Limitiranje izvrsavanja nekog streama
        List<Long> evenNumbers = new ArrayList<>();
        LongStream.iterate(0, number -> number + 2).limit(5).forEach(number -> evenNumbers.add(number));
        evenNumbers.forEach(System.out::println);
        printSeparator();

        // Prikaszuje opcionalno prvi element ukoliko postoji, u suprotnom priukazuje -1
        Optional<Long> firstEven = evenNumbers.stream().findFirst();
        System.out.println(firstEven.orElse(new Long(-1)));
        printSeparator();

        // Skipuje prvih n vodecih elemenata
        evenNumbers.stream().skip(3).forEach(System.out::println);
        printSeparator();

        Optional<Long> anyEven = evenNumbers.stream().findAny();
        System.out.println(anyEven.orElse(new Long(-1)));
        printSeparator();

        // Da li za elemente iz evenNumbers nema poklapanja sa p1
        Predicate<Long> p1 = n -> n.equals(1L);
        boolean noneMatch = evenNumbers.stream().noneMatch(p1);
        System.out.println(noneMatch);
        printSeparator();

        // Da li za elemente iz evenNumbers bar jedan poklapa sa p1
        boolean anyMatch = evenNumbers.stream().anyMatch(p1);
        System.out.println(anyMatch);
        printSeparator();

        // Da li se svi elementi poklapaju sa predpostavljenom vrednoscu
        List<Long> numbs = Arrays.asList(1l,1l,1l);
        boolean allMatch = numbs.stream().allMatch(p1);
        System.out.println(allMatch);
        printSeparator();

    }

    private static void printSeparator() {
        System.out.println("---------------------------------------------");
    }
}
