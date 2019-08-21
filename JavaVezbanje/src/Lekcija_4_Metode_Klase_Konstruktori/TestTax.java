package Lekcija_4_Metode_Klase_Konstruktori;

public class TestTax {
    public static void main(String[] args) {
        //lokalne propmenljive
        double grossIncome;
        String state;
        int dependants;

        grossIncome = 50000;
        state = "NJ";
        dependants = 2;

        Tax t1 = new Tax(grossIncome, state, dependants);
        double yourTax1 = t1.calcTax();  //propacun takse
        //prikazivanje rezultata
        System.out.println("Your tax is " + yourTax1 + "$");
        Tax.convertedToEuros(yourTax1);

        Tax t2 = new Tax(65000, 4);
        double yourTax2 = t2.calcTax(); //proracun takse
        //prikazivanje rezultata
        System.out.println("Your tax is " + yourTax2 + "$");
        Tax.convertedToEuros(yourTax2);
    }
}
