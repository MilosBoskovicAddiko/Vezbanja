package Lekcija_4_Metode_Klase_Konstruktori;

public class Tax {
    double grossIncome;
    String state;
    int dependents;
    static int customerCounter;

    //Konstruktor sa sva tri argumenta
    public Tax(double grossIncome, String state, int dependents) {
        this.grossIncome = grossIncome;
        this.state = state;
        this.dependents = dependents;
        customerCounter++;
        System.out.println("Prepairing the tax data for customer #" + customerCounter);
    }

    //Kontstruktor sa dva argumenta koji poziva konstruktor sa tri, uz default vrednost za state
    public Tax(double grossIncome, int dependents) {
        this(grossIncome, "NJ", dependents);
    }

    public double calcTax() {
        return grossIncome * 0.33 - dependents * 100;
    }

    public static void convertedToEuros(double taxInDollars) {
        System.out.println("Tax in Euros: " + taxInDollars / 1.25 + "€");
    }
}
