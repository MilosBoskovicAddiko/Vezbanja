package Lekcija_17.PovezivanjeThreadova;

public class TestThreadLambdaJoin {
    public static void main(String[] args) {

        //Lambda izraz za trzisne vesti
        Runnable mn = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000); // zaustaljanje niti u trajanju od 1 sekunde
                    System.out.println("Market is improving " + i);
                }
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName() + ": " + ie.toString());
            }
        };

        // Lambda izraz za portfolio
        Runnable port = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(700); // zaustavljanje niti u trajanju od 0.7 sekundi
                    System.out.println("You have " + (500 + i) + " shares of IBM");
                }
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName() + ": " + ie.toString());
            }
        };

        Thread makretNews = new Thread(mn, "Market News");
        Thread portfolio = new Thread(port, "Portfolio Data");

        makretNews.start();
        portfolio.start();

        try {
            makretNews.join();
            portfolio.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The main method of TestThreadLambdaJoin is finished!");
    }
}
