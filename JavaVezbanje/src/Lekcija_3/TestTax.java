package Lekcija_3;

public class TestTax {
    private double yourTax;

    public static void main(String[] args) {
        Tax t = new Tax();
        //dodeljivanje vrednosti clanovima klase Tax
        t.grossIncome = 50000;
        t.state = "NJ";
        t.dependents = 2;

        double yourTax = t.calcTax(); //odredjivanje poreza
        System.out.println("Your tax is " + yourTax);//prikazivanje rezulata

        NJTax njTax = new NJTax();
        //dodeljivanje vrednosti clanovima klase NJTax
        njTax.grossIncome = 50000;
        njTax.state = "NJ";
        njTax.dependents = 2;

        double yourTaxNj = njTax.calcTax(); //odredjivanje poreza
        double yourTaxForStudents = njTax.adjustForStudents(yourTaxNj); //popust za studente od 500$
        System.out.println("Your tax adjusted for students is " + yourTaxForStudents);  //prikazivanje rezultata
    }
}
