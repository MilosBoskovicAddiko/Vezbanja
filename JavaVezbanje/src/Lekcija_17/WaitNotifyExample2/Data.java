package Lekcija_17.WaitNotifyExample2;

public class Data {
    private String packet;

    // true if reciever should wait
    // false if sender should wait
    private boolean transfer = true;

    public synchronized void send(String packet) {
        while (!transfer) {
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        transfer = false;
        this.packet = packet;
        notifyAll();
    }

    public synchronized String recieve() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        transfer = true;
        notifyAll();
        return packet;
    }
}
