import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Stock {

    private Double price;
    private String symbol, currency, country;

    public Stock() {
    }

    public Stock(Double price, String symbol, String currency, String country) {
        this.price = price;
        this.symbol = symbol;
        this.currency = currency;
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
