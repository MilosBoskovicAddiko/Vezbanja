package Lekcija_24_Poziv_Udaljenih_Procedura.RMIexample.Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class StockServerImpl extends UnicastRemoteObject implements StockServer {

    private String price = null;
    private ArrayList<String> nasdaqSymbols = new ArrayList<>();

    public StockServerImpl() throws RemoteException {
        super();
        // Definisanje NASDAQ berzanskih simbola
        nasdaqSymbols.add("APPL");
        nasdaqSymbols.add("MSFT");
        nasdaqSymbols.add("YHOO");
        nasdaqSymbols.add("AMZN");
    }

    @Override
    public String getQuote(String symbol) throws RemoteException {
        if (nasdaqSymbols.indexOf(symbol.toUpperCase()) != -1) {
            // Generisanje slucajne cene za validne berzanske simbole
            price = (new Double(Math.random() * 100)).toString();
        }
        return price;
    }

    @Override
    public List<String> getNasdaqSymbols() throws RemoteException {
        return nasdaqSymbols;
    }
}
