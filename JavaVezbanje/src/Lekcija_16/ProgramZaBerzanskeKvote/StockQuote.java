package Lekcija_16.ProgramZaBerzanskeKvote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

public class StockQuote {

    static void printStockQuote(String symbol) {
        String csvString;
        URL url = null;
        URLConnection urlConnection = null;

        try {
            url = new URL("http://quote.yahoo.com/d/quotes.csv?s=" + symbol + "&f=sl1d1t1c1ohgv&e=.csv");
            urlConnection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader inStream = new InputStreamReader(urlConnection.getInputStream());
             BufferedReader bufferedReader = new BufferedReader(inStream);) {

            // preuzimanje podataka o akcijama u obliku csv stringa
            csvString = bufferedReader.readLine();

            // analiziranje csv stringa
            StringTokenizer tokenizer = new StringTokenizer(csvString,",");
            String ticker = tokenizer.nextToken();
            String price = tokenizer.nextToken();
            String tradeDate = tokenizer.nextToken();
            String tradeTime = tokenizer.nextToken();

            System.out.println("Symbol: " + ticker + " Price: " + price + " Date: " + tradeDate + " Time: " + tradeTime);

        } catch (MalformedURLException e) {
            System.out.println("Please check the spelling of the URL: " + e.toString());
        } catch (Exception e) {
            System.out.println("Can't read from the Internet: " + e.toString());
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Sample Usage: java StockQuote IBM");
            System.exit(0);
        }

        printStockQuote(args[0]);
    }
}
