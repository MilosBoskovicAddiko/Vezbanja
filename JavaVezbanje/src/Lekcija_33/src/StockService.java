import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/stock")
public class StockService {

    //@Produces({"application/xml", "application/json"})
    @Path("{symbol}")
    @GET
    public Stock getStock(@PathParam("symbol") String symbol) {
        Stock stock = StockServiceHelper.getStock(symbol);

        if (stock == null) {
            return new Stock(0.0, "NOT FOUND", "--", "--");
        }

        return stock;
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    public Response addStock(
            @FormParam("symbol") String symbol,
            @FormParam("currency") String currency,
            @FormParam("price") String price,
            @FormParam("country") String country) {

        if (StockServiceHelper.getStock(symbol) != null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Stock " + symbol + " already exists")
                    .type("text/plain").build();
        }

        double priceToUse;

        try {
            priceToUse = new Double(price);
        } catch (NumberFormatException e) {
            priceToUse = 0.0;
        }

        StockServiceHelper.addStock(new Stock(priceToUse,symbol, currency,country));

        return Response.ok().build();
    }
}
