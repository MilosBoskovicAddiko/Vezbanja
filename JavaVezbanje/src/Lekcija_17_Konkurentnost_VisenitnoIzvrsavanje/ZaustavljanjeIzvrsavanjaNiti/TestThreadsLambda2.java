package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.ZaustavljanjeIzvrsavanjaNiti;

public class TestThreadsLambda2 {
    public static void main(String[] args) {
        // Lambda izraz za citanje trzisne vrednosti
        Runnable mn = () -> {
            try{
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000); // privremeno zaustavljanje niti u toku jedne sekunde
                    System.out.println("The market is improving!");
                }
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName() + ": " + ie.getMessage());
            }
        };

        Thread marketNews = new Thread(mn, "Market News");
        marketNews.start();

        // Lambda izraz za portfolio
        Runnable p = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(700); // Privremeno zaustavljanje niti u trajanju od 0.7s (700 milisekundi)
                    System.out.println("You have " + (500 + i) + " shares of IBM!" );
                }
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName() + ": " + ie.getMessage());
            }
        };

        Thread portfolio = new Thread(p, "Portfolio");
        portfolio.start();

        TestThreadsLambda2 test = new TestThreadsLambda2();
        synchronized (test) {
            try{
                test.wait(20000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        System.out.println("The main method of TestThreadsLambda2 is finished!");

    }
}
