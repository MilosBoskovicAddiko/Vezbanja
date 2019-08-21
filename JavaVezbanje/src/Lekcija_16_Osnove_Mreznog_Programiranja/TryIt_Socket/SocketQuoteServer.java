package Lekcija_16_Osnove_Mreznog_Programiranja.TryIt_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketQuoteServer {

    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket client = null;

        BufferedReader inbound = null;
        OutputStream outbound = null;

        try {
            //Kreiranje soket servera
            serverSocket = new ServerSocket(3000);

            System.out.println("Waiting for a quote request...");

            while (true) {
                // Cekanje pojave zahteva
                client = serverSocket.accept();

                //Definisanje tokova
                inbound = new BufferedReader(new InputStreamReader(client.getInputStream()));
                outbound = client.getOutputStream();

                String symbol = inbound.readLine();

                // Generisanje slucajne cene akcije
                String price = (new Double(Math.random()*100).toString());
                outbound.write(("\n The price of " + symbol + " is " + price + "\n").getBytes());

                System.out.println("Request for " + symbol + " has been processed - the price of " + symbol + " is " + price + "\n");
                outbound.write("End\n".getBytes());
            }
        }
        catch (IOException ioe) {
            System.out.println("Error in Server: " + ioe);
        }
        finally {
            try {
                inbound.close();
                outbound.close();
            } catch (Exception e) {
                System.out.println("StockQuoteServer: can't close stream " + e.getMessage());
            }
        }
    }
}
