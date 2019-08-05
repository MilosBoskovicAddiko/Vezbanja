package Lekcija_14.DataInputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    // FileInputStream -> BufferedInputStream -> DataInputStream
    public static void main(String[] args) {
        try (FileInputStream myFile = new FileInputStream("C:\\Users\\Milos Boskovic\\Documents\\Vezbanja\\JavaVezbanje\\src\\Lekcija_14\\DataInputStream\\myFile");
             BufferedInputStream buff = new BufferedInputStream(myFile);
             DataInputStream data = new DataInputStream(buff);) {

            int num1 = data.readInt();
            System.out.println(num1);
            int num2 = data.readInt();
            System.out.println(num2);
            float num3 = data.readFloat();
            System.out.println(num3);
            float num4 = data.readFloat();
            System.out.println(num4);
            double num5 = data.readDouble();
            System.out.println(num5);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
