package Lekcija_20.SortiranjeJavaKolekcija.ComparatorInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Beer> beers = loadCellar();

        printSeparator();
        System.out.println("Sorting by ascending price");
        printSeparator();
        beers.sort(Comparator.comparing(beer -> beer.price));
        beers.forEach(System.out::println);

        printSeparator();
        System.out.println("Sorting by descending price");
        printSeparator();

        beers.sort(Comparator.comparing((Beer beer) -> beer.price).reversed()); // Moze preko lambda izraza uz neophodno eksplicitno kastovanje
        beers.forEach(System.out::println);

        printSeparator();
        System.out.println("Sorting by price and name");
        printSeparator();
        beers.sort(Comparator.comparing(Beer::getPrice).thenComparing(Beer::getName)); // A moze i ovako koriscenjem reference metoda
        beers.forEach(System.out::println);
    }

    static List<Beer> loadCellar() {
        List<Beer> beerStock = new ArrayList<>();

        beerStock.add(new Beer("Stella", "Belgium", 8.25f));
        beerStock.add(new Beer("Sam Adams", "USA", 7.00f));
        beerStock.add(new Beer("Obolon", "Ukraine", 7.00f));
        beerStock.add(new Beer("Bud Light", "USA", 5.00f));
        beerStock.add(new Beer("Yuengling", "USA", 5.50f));
        beerStock.add(new Beer("Leffe Blonde", "Belgium", 8.75f));
        beerStock.add(new Beer("Cimau Blue", "Belgium", 10.00f));
        beerStock.add(new Beer("Brooklyn Lager", "USA", 8.25f));

        return beerStock;
    }

    private static void printSeparator() {
        System.out.println("-------------------------------------------");
    }
}
