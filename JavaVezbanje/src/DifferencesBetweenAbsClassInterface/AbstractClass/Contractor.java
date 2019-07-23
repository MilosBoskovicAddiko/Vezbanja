package DifferencesBetweenAbsClassInterface.AbstractClass;

public class Contractor extends Person {
    public Contractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePayment(int percent) {
        if(percent<INCREASE_CAP){
            System.out.println("Increasing hourly rate by "+percent+"%. "+getName());
            System.out.println("---------------------------------------------------------------------------");
            return true;
        }else{
            System.out.println("Sorry, can't increase hopurly rate by more than "+INCREASE_CAP+"%. "+getName());
            System.out.println("---------------------------------------------------------------------------");
            return false;
        }
    }
}
