package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.RunnableInterface;

public class MarketNews2 implements Runnable{
    @Override
    public void run() {
        System.out.println("The stock market is improving!");
    }
}
