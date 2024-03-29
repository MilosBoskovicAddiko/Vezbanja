package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.BezNasledjivanje;

public class TestThreadsLambda {
    public static void main(String[] args) {
        Thread mn = new Thread(()->
            System.out.println("The stock market is improving!"),"Market News");
        mn.start();

        Thread p = new Thread (()->
                System.out.println("You have 500 shares of IBM"), "Portfolio Data");
        p.start();

        System.out.println("TestThreadsLambda is finished");
    }
}
