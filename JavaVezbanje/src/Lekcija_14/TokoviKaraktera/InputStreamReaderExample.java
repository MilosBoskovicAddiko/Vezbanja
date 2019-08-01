package Lekcija_14.TokoviKaraktera;

import java.io.*;

public class InputStreamReaderExample {

    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();

        try (FileInputStream myFile = new FileInputStream("C:\\Users\\Milos Boskovic\\Documents\\Vezbanja\\JavaVezbanje\\src\\Lekcija_14\\TokoviKaraktera\\citanje");
             InputStreamReader inputStreamReader = new InputStreamReader(myFile, "UTF-8");Reader reader = new BufferedReader(inputStreamReader);) {

            int ch; // kod pojedinacnog karaktera
            while ((ch = reader.read()) > -1) {
                buffer.append((char) ch);
            }
            System.out.println(buffer.toString());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
