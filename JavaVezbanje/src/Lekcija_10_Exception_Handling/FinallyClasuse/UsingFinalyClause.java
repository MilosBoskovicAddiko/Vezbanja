package Lekcija_10_Exception_Handling.FinallyClasuse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingFinalyClause {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Milos Boskovic\\Documents\\Vezbanja\\JavaVezbanje\\src\\Lekcija_10\\FinallyClasuse\\text");
        FileReader fr = new FileReader(file);
        try {
            fr.read();
            System.out.println("Reading file.....");
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                fr.close();
                System.out.println("File reader is closed!");
            } catch (IOException ioe) {
                ioe.getMessage();
            }
        }
    }

}
