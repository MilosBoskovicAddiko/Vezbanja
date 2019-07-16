package Lesson5_copy;

public class Tax {
    double grossIncome;
    String state;
    int dependents;

    public Tax(double grossIncome, String state, int dependents) {
        this.grossIncome = grossIncome;
        this.state = state;
        this.dependents = dependents;
    }

    public double calcTax(){
        double stateTax=0;
        if(grossIncome < 30000){
            return grossIncome*0.05;
        }else{
            return grossIncome*0.06;
        }

    }
}
