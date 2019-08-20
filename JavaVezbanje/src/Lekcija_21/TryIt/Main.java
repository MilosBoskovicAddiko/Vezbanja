package Lekcija_21.TryIt;

public class Main {
    public static void main(String[] args) {
        Portfolio p = new Portfolio();
        Thread thread = new Thread(p);
        thread.start();
    }
}
