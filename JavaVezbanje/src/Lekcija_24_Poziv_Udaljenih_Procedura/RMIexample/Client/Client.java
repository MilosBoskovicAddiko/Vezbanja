package Lekcija_24_Poziv_Udaljenih_Procedura.RMIexample.Client;

import Lekcija_24_Poziv_Udaljenih_Procedura.RMIexample.Server.StockServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    public static void main(String[] args) {
        args = new String[1];
        args[0] = "YHOO";
        if (args.length == 0) {
            System.out.println("Sample usage: java client.Client AAPL");
            System.exit(0);
        }

        try {
            // Look up remote object
            StockServer myServer = (StockServer) Naming.lookup("rmi://localhost:1099/QuoteService");
            // Call remote method
            String price = myServer.getQuote(args[0]);
            // Display the results
            if (price != null) {
                System.out.println("The price of " + args[0] + " is: $" + price);
            } else {
                System.out.println("Invalid Nasdaq symbol. Please use one of these: " + myServer.getNasdaqSymbols().toString());
            }
        } catch (MalformedURLException exMF) {
            System.out.println(exMF.getMessage());
        } catch (NotBoundException exNB) {
            System.out.println(exNB.getMessage());
        } catch (RemoteException exRE) {
            System.out.println(exRE.getMessage());
        }
    }
}
