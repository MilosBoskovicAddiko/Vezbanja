package Lekcija_20.KoriscenjeStreamAPIInterfejsaSaIOTokovima;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteReaderStream {
    public static void main(String[] args) {
        String nextLine;
        URL url = null;
        URLConnection urlConnection = null;

        try {
            // Podrazumeva se da je index.html podrazumevani naziv pocetne stranice
            url = new URL("https://www.linkedin.com/feed/");
            urlConnection = url.openConnection();
        } catch (IOException e) {
            System.out.println("Can't connect to the providing URL: " + e.toString());
        }

        try (InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream(),"UTF8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){

            // Ocitavanje i prikazivanje sadrzaja Google pocetne strane pomocu Stream API interfejsa
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Can't read from the Internet: " + e.toString());
        }
    }
}
