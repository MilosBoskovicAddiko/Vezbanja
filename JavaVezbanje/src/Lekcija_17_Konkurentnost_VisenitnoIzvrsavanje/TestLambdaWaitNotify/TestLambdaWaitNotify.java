package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.TestLambdaWaitNotify;

public class TestLambdaWaitNotify {

    private static Runnable getMktNewsRunnable(Object whoToNotify) {
        // Definisanje konteksta iz okruzenja
        return () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000); // nit se zaustavlja 1 sekundu
                    System.out.println("The market is improving " + i);
                }
                synchronized (whoToNotify) {
                    whoToNotify.notify(); // slanje obavestenja osnovnoj niti
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ": " + e.toString());
            }
        };
    }

    public static void main(String[] args) {

        TestLambdaWaitNotify thisInstance = new TestLambdaWaitNotify();

        Runnable mktNewsRunnable = getMktNewsRunnable(thisInstance);
        Thread marketNews = new Thread(mktNewsRunnable,"Market News");
        marketNews.start();

        synchronized (thisInstance) {
            try {
                thisInstance.wait(15000); //cekanje najvise 15 sekundi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("The main method of TestLambdaWaitNotify is finished!");
    }
}
