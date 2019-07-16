package Lesson4_copy;

public class TestTax {
    public static void main(String[] args) {
        double grossIncome;
        String state;
        int dependents;

        grossIncome = 50000;
        dependents = 2;
        state = "NJ";

        System.out.println("--------------------------------------");
        Tax t = new Tax(grossIncome,dependents,state);
        double yourTax = t.calcTax();
        System.out.println("Your tax is "+yourTax);
        Tax.convertToEuros(yourTax);
        System.out.println("--------------------------------------");

        Tax t2 = new Tax(65000,4,"TX");
        double hisTax = t2.calcTax();
        System.out.println("Your tax is "+hisTax);
        Tax.convertToEuros(hisTax);
        System.out.println("--------------------------------------");



    }
}
