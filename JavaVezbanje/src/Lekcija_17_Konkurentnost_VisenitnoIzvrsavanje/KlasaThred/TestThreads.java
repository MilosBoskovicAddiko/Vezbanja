package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.KlasaThred;

public class TestThreads {
    // Skoro svaki put cemo dobiti drugaciji rezultat jer se niti izvrsavaju simultano
    // i sve zavisi od toga koja nit se prva izvrsi do kraja
    public static void main(String[] args) {
        MarketNews mn = new MarketNews("Market News");
        mn.start();

        Portfolio p = new Portfolio("Portfolio Data");
        p.start();

        System.out.println("The threads are finished");
    }
}
