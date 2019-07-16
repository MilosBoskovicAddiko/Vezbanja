package lesson6_copy;

public class ForeignContractor extends Person implements Payable{
    public ForeignContractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent){
        return false;
    }
}
