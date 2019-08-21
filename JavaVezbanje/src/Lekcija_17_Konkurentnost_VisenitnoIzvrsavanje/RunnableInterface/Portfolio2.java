package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.RunnableInterface;

public class Portfolio2 implements Runnable {
    @Override
    public void run() {
        System.out.println("You have 500 shares of IBM!");
    }
}
