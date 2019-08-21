package Lekcija_16_Osnove_Mreznog_Programiranja.ProgramZaBerzanskeKvote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Berza {
    public static void main(String[] args) {
        String theWholePage;
        String txt;
        URL url =null;
        URLConnection urlConn = null;

        try {
            // Pretpostavka je da je index.html podrazumevani naziv pocetne stranice
            url = new URL("https://finance.yahoo.com/q?s=AAPL");
            urlConn = url.openConnection();
        } catch (
                IOException e) {
            System.out.println("Can't connect to the provider URL: "+ e.toString());
        }

        try(InputStreamReader inputStreamReader = new InputStreamReader(urlConn.getInputStream(),"UTF8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {

            StringBuilder sbld = new StringBuilder(10000);

            // Ocitava se i prikazuje sadrzaj pocetne Google stranice
            while ((txt=bufferedReader.readLine()) != null) {
                sbld.append(txt);
            }
            theWholePage = sbld.toString();
            System.out.println(theWholePage);
        } catch (IOException e) {
            System.out.println("Sorry, can't read from the internet: " + e.toString());
        }
    }
}
