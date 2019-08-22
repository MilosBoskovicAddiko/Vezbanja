package Lekcija_24_Poziv_Udaljenih_Procedura.RMIexample.Server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class StartServer {

    public static void main(String[] args) {

        try {
            // Kreiranje registra na portu 1099
            LocateRegistry.createRegistry(1099);

            // Instanciranje StockServerImpl klase i povezivanje
            // sa registrom pod nazivom QuoteServer
            StockServerImpl ssi = new StockServerImpl();
            Naming.rebind("rmi://localhost:1099/QuoteService",ssi);

            System.out.println("<QuoteService> is ready...");

        } catch (MalformedURLException exMF) {
            System.out.println(exMF.getMessage());
        } catch (RemoteException exRM) {
            System.out.println(exRM.getMessage());
        }
    }
}
