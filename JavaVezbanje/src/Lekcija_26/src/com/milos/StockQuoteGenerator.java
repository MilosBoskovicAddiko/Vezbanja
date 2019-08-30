package com.milos;

import java.util.ArrayList;
import java.util.List;

public class StockQuoteGenerator {
    private String price = null;
    private ArrayList<String> nasdaqSymbols = new ArrayList<>();

    public StockQuoteGenerator(){
        nasdaqSymbols.add("APPL");
        nasdaqSymbols.add("MSFT");
        nasdaqSymbols.add("YHOO");
        nasdaqSymbols.add("AMZN");
    }

    public String getPrice(String symbol){
        if (nasdaqSymbols.indexOf(symbol.toUpperCase()) != -1) {
            // Generisanje slucajne cene za validne berzanske simbole
            price = (new Double(Math.random() * 100)).toString();
        }
        return price;
    }

    public List<String> getNasdaqSymbols(){
        return nasdaqSymbols;
    }

}
