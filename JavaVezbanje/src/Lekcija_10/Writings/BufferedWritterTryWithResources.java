package Lekcija_10.Writings;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BufferedWritterTryWithResources {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Milos Boskovic\\Documents\\Vezbanja\\JavaVezbanje\\src\\Lekcija_10\\Writings\\text"))) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Unesite neki tekst: ");
            String line = scanner.nextLine();
            bufferedWriter.write(line);
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
