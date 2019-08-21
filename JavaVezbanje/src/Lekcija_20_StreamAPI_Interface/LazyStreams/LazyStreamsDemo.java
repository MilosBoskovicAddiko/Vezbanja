package Lekcija_20_StreamAPI_Interface.LazyStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class LazyStreamsDemo {

    public static void main(String[] args) {
        List<Beer> beers = loadCellar();

        //Prva intermedijalna operacija
        Stream<Beer> americanBeers = beers.stream().filter(brs -> {
            System.out.println("Inside filter: " + brs.country);
            return brs.country.equals("USA");
        });

        // Druga intermedijalna operacija
        DoubleStream americanBeerPrices = americanBeers.mapToDouble(brs -> {
            System.out.println("Inside mapToDouble: " + brs.name + " : " + brs.price);
            return brs.price;
        });

        // Terminalna operacija je postavljena u komentar
        //System.out.println("The average American beer price is $" + americanBeerPrices.average().getAsDouble());
    }

    // Popunjavanje beer kolekcije
    static List<Beer> loadCellar() {
        List<Beer> beerStock = new ArrayList<>();

        beerStock.add(new Beer("Stella", "Belgium", 7.75f));
        beerStock.add(new Beer("Sam Adams", "USA", 7.00f));
        beerStock.add(new Beer("Obolon", "Ukraine", 4.00f));
        beerStock.add(new Beer("Bud Light", "USA", 5.00f));
        beerStock.add(new Beer("Yuengling", "USA", 5.50f));
        beerStock.add(new Beer("Leffe Blonde", "Belgium", 8.75f));
        beerStock.add(new Beer("Cimau Blue", "Belgium", 10.00f));
        beerStock.add(new Beer("Brooklyn Lager", "USA", 8.25f));

        return beerStock;
    }
}
