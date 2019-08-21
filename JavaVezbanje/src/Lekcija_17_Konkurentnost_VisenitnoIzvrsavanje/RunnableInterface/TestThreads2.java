package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.RunnableInterface;

public class TestThreads2 {
    public static void main(String[] args) {
        MarketNews2 mn2 = new MarketNews2();
        // Prosledjivanje Runnable objekta u konstruktor Thread klase
        Thread mn = new Thread(mn2, "Market News");
        mn.start();

        Runnable p2 = new Portfolio2();
        // Prosledjivanje Runnable objekta u konstruktor Thread klase
        Thread p = new Thread(p2, "Portfolio");
        p.start();

        System.out.println("TestThread2 is finished!");
    }
}
