package Lesson3_copy;

public class TestTax {
    public static void main(String[] args) {
        Tax t = new Tax();
        t.grossIncome = 50000;
        t.state = "NJ";
        t.dependents = 2;
        double calTaxT = t.calcTax();
        System.out.println("Calculated tax for \"t\" is "+calTaxT);
        System.out.println("------------------------------------");
        //Tax t1 = new NJTax();
        NJTax t1 = new NJTax();
        t1.grossIncome = 50000;
        t1.state = "NJ";
        t1.dependents = 2;
        double calNjTax = t1.calcTax();
        //double adjustedTax = t1.adjustForStudents(calNjTax);
        System.out.println("Calculated tax for \"njTax\" is "+calNjTax);
        System.out.println("------------------------------------");
    }
}
