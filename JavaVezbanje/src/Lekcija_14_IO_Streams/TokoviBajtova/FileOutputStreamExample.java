package Lekcija_14_IO_Streams.TokoviBajtova;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {

        int[] someData = {84, 104, 105, 115, 32, 105, 115, 32, 97, 32, 116, 101, 115, 116, 32, 102, 105, 108, 101};

        try(FileOutputStream myFile = new FileOutputStream("C:\\Users\\Milos Boskovic\\Documents\\Vezbanja\\JavaVezbanje\\src\\Lekcija_14\\TokoviBajtova\\pisanje")) {
            for (int i = 0; i < someData.length; i++) {
                myFile.write(someData[i]);
            }
        } catch (IOException ioe) {
            System.out.println("System could not write to a file: " + ioe.toString());
        }
    }
}
