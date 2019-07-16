package Lesson4_copy;

public class Tax {
    double grossIncome;
    int dependants;

    String state;

    static int customerCount = 0;

    public Tax(double grossIncome,int dependants, String state){
        this.grossIncome=grossIncome;
        this.dependants=dependants;
        this.state=state;
        customerCount++;

        System.out.println("Preparing the tax date for customer #"+customerCount);
    }

    public double calcTax(){
        return(grossIncome*0.33-dependants*100);
    }

    public static void convertToEuros(double taxInDollars){
        System.out.println("Tax in Euros: "+taxInDollars/1.25);
    }
}
