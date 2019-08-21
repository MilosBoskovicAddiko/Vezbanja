package Lekcija_20_StreamAPI_Interface.OsnoveTokova;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Beer> beers = loadCellar(); // Popunjavanje beer kolekcije iz pomocnog metoda
        List<Beer> americanBeers = new ArrayList<>();
        printBeers(beers);
        printSeparator();
        // Moze ovako
        //americanBeers = beers.stream().filter(beer -> beer.country.equals("US")).collect(Collectors.toList());
        //printBeers(americanBeers);

        // Ili ovako ako nam nije neoophodno da cuvamo podatke
        beers.stream().filter(beer -> beer.country.equals("US")).forEach(System.out::println);

    }

    private static List<Beer> loadCellar() {
        List<Beer> beers = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int randomNum = random.nextInt(3);
            switch (randomNum) {
                case 0:
                    beers.add(new Beer("Danish " + i, "DK", 100));
                    break;
                case 1:
                    beers.add(new Beer("American " + i, "US", 50));
                    break;
                case 2:
                    beers.add(new Beer("Serbian " + i, "RS", 25));
                    break;
            }
        }
        return beers;
    }

    private static void printBeers(List<Beer> beerList) {
        beerList.forEach(System.out::println);
    }

    private static void printSeparator() {
        System.out.println("-------------------------------------------");
    }
}
