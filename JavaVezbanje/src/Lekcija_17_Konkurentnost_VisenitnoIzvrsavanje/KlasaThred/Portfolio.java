package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.KlasaThred;

public class Portfolio extends Thread {
    public Portfolio (String threadName) {
        super(threadName);
    }

    public void run() {
        System.out.println("You have 500 shares of IBM!");
    }
}
