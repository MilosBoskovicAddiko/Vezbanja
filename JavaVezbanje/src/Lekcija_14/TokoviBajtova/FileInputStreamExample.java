package Lekcija_14.TokoviBajtova;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {

        try (FileInputStream myFile = new FileInputStream("C:\\Users\\Milos Boskovic\\Documents\\Vezbanja\\JavaVezbanje\\src\\Lekcija_14\\TokoviBajtova\\citanje")) {
            boolean eof = false;

            while (!eof) {
                int byteValue = myFile.read();
                System.out.print(byteValue + " ");
                if (byteValue == -1) {
                    eof = true;
                }
            }
        } catch (IOException ioe) {
            System.out.println("Could not read file: " + ioe.toString());
        }
    }
}
