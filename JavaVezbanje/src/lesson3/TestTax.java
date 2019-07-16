package lesson3;


public class TestTax {
    public static void main(String[] args) {
        Tax t = new Tax();
        t.grossIncome = 50000;
        t.dependents = 2;
        t.state = "NJ";

        double yourTax = t.calcTax();
        System.out.println("Your tax is: "+yourTax);
        NJTax t1 = new NJTax();
        t1.dependents =2;
        t1.grossIncome = 50000;
        t1.state = "NJ";
        double yourTax1 = t1.calcTax();
        double totalTax = t1.adjustForStudents(yourTax);
        double totalTax1 = t1.calcTax();
        System.out.println("Your tax is: "+yourTax1);
        System.out.println("Your tax for NJ is: "+totalTax);
        System.out.println("Your tax for NJ is: "+totalTax1);



    }
}
