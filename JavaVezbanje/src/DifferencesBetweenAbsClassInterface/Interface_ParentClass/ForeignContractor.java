package MojeVezbanje.Interface_ParentClass;

public class ForeignContractor extends Person implements Payable{
    public ForeignContractor(String name) {
        super(name);
    }
    @Override
    public boolean increasePay(int percent){
        System.out.println("I'm just a foreign worker!");
        System.out.println("---------------------------------------------------------------------------");
        return false;
    }
}
