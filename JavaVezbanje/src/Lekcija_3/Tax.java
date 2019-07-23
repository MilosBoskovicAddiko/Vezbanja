package Lekcija_3;

public class Tax {
    double grossIncome;
    String state;
    int dependents;

    public double calcTax() {
        return grossIncome < 30000 ? grossIncome * 0.05 : grossIncome * 0.06;
    }
}
