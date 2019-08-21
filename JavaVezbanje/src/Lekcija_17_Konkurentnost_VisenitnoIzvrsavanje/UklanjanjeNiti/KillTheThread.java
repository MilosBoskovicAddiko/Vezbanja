package Lekcija_17_Konkurentnost_VisenitnoIzvrsavanje.UklanjanjeNiti;

public class KillTheThread {
    public static void main(String[] args) {

        PortfolioVolatile p = new PortfolioVolatile("Portfolio data");
        p.start();

        // Odredjeni kod za implementaciju poslovne logijke postavlja se ovde
        int i = 0;
        do {
            System.out.println("i = " + i++);
        } while (i < 10);

        // i sada je neophodno zaustaviti nit
        p.stopMe();
    }
}
