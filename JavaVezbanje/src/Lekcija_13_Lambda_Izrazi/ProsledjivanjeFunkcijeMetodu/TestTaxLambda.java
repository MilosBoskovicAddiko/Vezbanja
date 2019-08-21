package Lekcija_13_Lambda_Izrazi.ProsledjivanjeFunkcijeMetodu;

public class TestTaxLambda {

    public static void main(String[] args) {

        // Definisanje funkcije pomocu lambda izraza
        // i dodeljivanje promenljivoj
        TaxFunction taxFunction = (double grossIncome) -> {
            double federalTax = 0;
            if (grossIncome < 30000) {
                federalTax = grossIncome * 0.05;
            } else {
                federalTax = grossIncome * 0.06;
            }
            return federalTax;
        };

        // Definisanje druge funkcije pomocu lambda izraza
        // za odredjivanje poreza clanovima mafije
        TaxFunction taxFunctionMafia = grossIncome -> {
            double stateTax = 0;
            if (grossIncome < 30000) {
                stateTax = grossIncome * 0.01;
            } else {
                stateTax = grossIncome * 0.02;
            }
            return stateTax;
        };

        Customer customer1 = new Customer();
        customer1.name = "Mary Lou";
        customer1.grossIncome = 50000;
        customer1.applyTaxCalcFunction(taxFunction);

        Customer customer2 = new Customer();
        customer2.name = "Al Capone";
        customer2.grossIncome = 25000;
        customer2.applyTaxCalcFunction(taxFunctionMafia);
    }
}
