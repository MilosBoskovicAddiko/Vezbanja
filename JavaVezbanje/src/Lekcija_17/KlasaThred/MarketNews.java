package Lekcija_17.KlasaThred;

public class MarketNews extends Thread {
    public MarketNews(String threadName) {
        super(threadName); // definisanje naziva niti
    }

    public void run() {
        System.out.println("The stock market is improving!");
    }
}
