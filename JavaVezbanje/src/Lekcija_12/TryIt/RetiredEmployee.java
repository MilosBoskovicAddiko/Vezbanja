package Lekcija_12.TryIt;

public class RetiredEmployee extends Employee {

    private Double pensionAmount;

    public RetiredEmployee(String name, Double pensionAmount) {
        super(name);
        this.pensionAmount = pensionAmount;
    }

    public Double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(Double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }
}
