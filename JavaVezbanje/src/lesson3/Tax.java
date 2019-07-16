package lesson3;

import java.io.Serializable;

public class Tax {
    double grossIncome;
    String state;
    int dependents;

    public double calcTax(){
        double stateTax=0;
        if(grossIncome < 30000){
            return grossIncome*0.05;
        }else{
            return grossIncome*0.06;
        }
    }

}
