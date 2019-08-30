package Lesson_34_Java_Logovanje_API.LogFilteringRepeat;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockQuoteRepeat {

    private static Logger stockQuoteLogger = Logger.getLogger(StockQuoteRepeat.class.getName());

    static Filter expensiveQuotes = (record -> {
       Object[] parameters = record.getParameters();
        Double price = ((Double) parameters[0]);//.doubleValue();
        return (price > 60) ? true : false;
    });

    private static Double getPrice(String symbol) {
        Double price = Math.random() * 100;
        stockQuoteLogger.log(Level.INFO, symbol + " : " + price, price);
        return price;
    }

    public static void main(String[] args) {
        stockQuoteLogger.setFilter(expensiveQuotes);

        getPrice("AAPL");
        getPrice("MSFT");
        getPrice("IBM");
        getPrice("CAT");
        getPrice("VZ");
    }

}
