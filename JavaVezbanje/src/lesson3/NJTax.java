package lesson3;


public class NJTax extends Tax {

     public double adjustForStudents(double stateTax){
        double adjustedTax = stateTax - 500;
        return adjustedTax;
    }

    @Override
    public double calcTax() {
        return super.calcTax()-500;
    }

}
