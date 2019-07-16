package MojeVezbanje.JustWithInterface;

public class Contractor implements Payable {
    private String name;

    public Contractor(String name) {
        this.name = name;
    }

    @Override
    public boolean increasePay(int percent) {
        if(percent<INCREASE_CAP){
            System.out.println("Increasing hourly rate by "+ percent+"%. "+name);
            System.out.println("-----------------------------------------------------------");
            return true;
        }else{
            System.out.println("Sorry, can't increase hourly rate by more than "+INCREASE_CAP+"%. "+name);
            System.out.println("-----------------------------------------------------------");
            return false;
        }
    }
}
