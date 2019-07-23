package Lekcija_3;

public class NJTax extends Tax{
    public double adjustForStudents(double stateTax){
        return stateTax-500;
    }
}
