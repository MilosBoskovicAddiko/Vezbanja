package Lekcija_20_StreamAPI_Interface.SortiranjeTokova;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Beer> beers = loadCellar();
        // Sortiranop po drzava i cenama rastuce
        beers.stream().sorted(Comparator.comparing(Beer::getCountry).thenComparing(Beer::getPrice)).forEach(System.out::println);
        printSeparator();
        // Sortirano po drzavi rastuce, a po ceni opadajuce
        beers.stream().sorted(Comparator.comparing(Beer::getCountry).thenComparing(Comparator.comparing(Beer::getPrice).reversed())).forEach(System.out::println);
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
