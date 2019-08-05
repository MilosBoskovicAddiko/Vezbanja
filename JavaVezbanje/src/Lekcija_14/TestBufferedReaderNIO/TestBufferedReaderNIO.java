package Lekcija_14.TestBufferedReaderNIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestBufferedReaderNIO {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("states.txt");

        try (BufferedReader reader = Files.newBufferedReader(sourceFile, StandardCharsets.UTF_8)) {
            String stateName;

            while ((stateName = reader.readLine()) != null) {
                System.out.println("Got the state " + stateName);
            }
        } catch (IOException ioe) {
            System.out.println("Error while reading states.txt: " + ioe.getMessage());
        }
    }
}
