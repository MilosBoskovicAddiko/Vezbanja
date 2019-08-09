package Lekcija_16.CitanjeSaGoogle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteReader {
    public static void main(String[] args) {
        String nextLine;
        URL url =null;
        URLConnection urlConn = null;

        try {
            // Pretpostavka je da je index.html podrazumevani naziv pocetne stranice
            url = new URL("https://www.google.com");
            urlConn = url.openConnection();
        } catch (IOException e) {
            System.out.println("Can't connect to the provider URL: "+ e.toString());
        }

        try(InputStreamReader inputStreamReader = new InputStreamReader(urlConn.getInputStream(),"UTF8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {

            // Ocitava se i prikazuje sadrzaj pocetne Google stranice
            while (true) {
                nextLine = bufferedReader.readLine();
                if (nextLine != null) {
                    System.out.println(nextLine);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Sorry, can't read from the internet: " + e.toString());
        }
    }
}
