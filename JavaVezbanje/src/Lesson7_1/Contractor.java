package Lesson7_1;

public class Contractor implements Payable {

    private String name;

    public Contractor(String name) {
        this.name = name;
    }

    @Override
    public boolean increasePay(int percent) {
        if(percent<Payable.INCREASE_CAP){
            System.out.println("Increasing salary by " + percent + "%. "+ name);
            return true;
        }else{
            System.out.println("Sorry, can't increase hourly rate by more than "+Payable.INCREASE_CAP+"%. "+name);
            return false;
        }
    }
}
