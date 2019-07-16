package Lesson5_copy;

public class TestTax {
    public static void main(String[] args){
        double grossIncome; // local variables
        String state;
        int dependents;

        if(args.length !=3){
            System.out.println("Sample usage of the program: java testTax 50000 NJ 2");
            System.exit(0);
        }
        grossIncome = Double.parseDouble(args[0]);
        state = args[1];
        dependents = Integer.parseInt(args[2]);

        Tax t = new Tax(grossIncome, state, dependents);
        double yourTax = t.calcTax(); //calculating tax
        System.out.println("Your tax is: "+yourTax);


    }

}
