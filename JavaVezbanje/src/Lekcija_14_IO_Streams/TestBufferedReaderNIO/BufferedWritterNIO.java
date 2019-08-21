package Lekcija_14_IO_Streams.TestBufferedReaderNIO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferedWritterNIO {
    public static void main(String[] args) {

        Path myOutputFile = Paths.get("someOutputFile.txt");
        try (BufferedWriter writter = Files.newBufferedWriter(myOutputFile, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            writter.write("Whatever You want to write!!! Once more!!! And MORE!!!\n ");
        } catch (IOException ioe) {
            System.out.println("Can't write into someOutputFile.txt file: " + ioe.getMessage());
        }
    }
}
