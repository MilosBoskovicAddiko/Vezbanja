package Lekcija_17.WaitNotifyExample2;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable{
    private Data load;

    public Receiver(Data load) {
        this.load = load;
    }

    @Override
    public void run() {
        for (String receivedMessage = load.recieve();
        !receivedMessage.equals("End");
        receivedMessage = load.recieve()) {

            System.out.println("Recieved packet: " + receivedMessage);
        }

        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
