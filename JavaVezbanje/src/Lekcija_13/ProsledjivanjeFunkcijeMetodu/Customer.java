package Lekcija_13.ProsledjivanjeFunkcijeMetodu;

import javax.xml.transform.sax.SAXSource;

public class Customer {

    public String name;
    public double grossIncome;

    public void applyTaxCalcFunction(TaxFunction taxFunction) {
        double calculatedTax = taxFunction.calcTax(grossIncome);
        System.out.println("The calculated tax for " + name + " is " + calculatedTax);
    }
}
