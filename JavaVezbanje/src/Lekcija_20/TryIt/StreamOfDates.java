package Lekcija_20.TryIt;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class StreamOfDates {
    public static void main(String[] args) {
        // Generating a stream
        Stream<LocalDateTime> timeStream = Stream.generate(StreamOfDates::myStopWatchFunction).limit(5);
        timeStream.forEach(System.out::println);
    }

    private static LocalDateTime myStopWatchFunction() {
        // Implementacija Supplier interfejsa
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LocalDateTime.now(); // vraca trenutno vreme
    }
}
