package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.UpravljanjeNitimaPomocuExecutorRadnogOkvira;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestCallableThreads {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Lambda izraz za trzisne vesti
        Callable<Integer> mn = () -> {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("The market is improving " + i);
            }
            return 12345;
        };

        // Lambda izraz za portfolio
        Callable<Integer> port = () -> {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(700);
                System.out.println("You have " + (500 + i) + " shares of IBM");
            }
            return 10;
        };

        // Lokacija za Future objekat
        List<Future<Integer>> futures = new ArrayList<Future<Integer>>();

        // Lokacija za rezultate koje vracaju niti
        List<Integer> results = new ArrayList<Integer>();

        final ExecutorService service = Executors.newFixedThreadPool(2);

        try {
            futures.add(service.submit(port));
            futures.add(service.submit(mn));

            for(Future<Integer> future : futures) {
                results.add(future.get());
            }
        } finally {
            service.shutdown();
        }

        for (Integer res : results) {
            System.out.println("\nGot the result: " + res);
        }
    }
}
