import java.util.HashMap;
import java.util.Map;

public class StockServiceHelper {
    private static Map<String, Stock> stocks = new HashMap<>();

    public static void addStock(Stock stock) {
        stocks.put(stock.getSymbol(), stock);
    }

    public static void removeStock(String symbol) {
        stocks.remove(symbol);
    }

    public static Stock getStock(String symbol) {
        return stocks.get(symbol);
    }

    static {
        generateStocks();
    }

    private static void generateStocks() {
        addStock(new Stock(43.12, "IBM", "USD","USA"));
        addStock(new Stock(120.0, "AAPL", "USD", "USA"));
    }
}
