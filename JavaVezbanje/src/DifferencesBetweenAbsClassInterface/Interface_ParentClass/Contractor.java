package DifferencesBetweenAbsClassInterface.Interface_ParentClass;

public class Contractor extends Person implements  Payable{
    public Contractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        if(percent<INCREASE_CAP){
            System.out.println("Salary increased by "+percent+"%. "+getName());
            System.out.println("---------------------------------------------------------------------------");
            return true;
        }else{
            System.out.println("Sorry, can't increase salary by more than "+INCREASE_CAP+"%. "+getName());
            System.out.println("---------------------------------------------------------------------------");
            return false;
        }

    }
}
