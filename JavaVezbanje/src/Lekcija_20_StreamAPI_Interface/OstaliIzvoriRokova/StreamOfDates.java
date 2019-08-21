package Lekcija_20_StreamAPI_Interface.OstaliIzvoriRokova;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamOfDates {
    public static void main(String[] args) {
        /*ArrayList<Long> longs = new ArrayList<Long>(Arrays.asList(1l,2l,3l));
        System.out.println(Collections.max(longs));

        // Primer nalazenja maksimuma preko stream-a
        LongStream.Builder stream = LongStream.builder();
        longs.forEach(x-> stream.add(x));
        System.out.println(stream.build().max().getAsLong());*/

        // Implementiranje Supplier interfejsa
        Supplier<LocalDateTime> myStopWatch = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            return LocalDateTime.now(); // Ocitavanje trenutnog interfejsa
        };

        // Generisanje toka koriscenjem lambda izraza
        Stream<LocalDateTime> timeStream = Stream.generate(myStopWatch);
        timeStream.limit(5).forEach(System.out::println);

        // Pupunjavanje liste
        ArrayList<Long> evenNumbs = new ArrayList<>();
        LongStream.iterate(0, num -> num+2).limit(10).forEach(num-> evenNumbs.add(num));
        evenNumbs.forEach(System.out::println);

    }
}
