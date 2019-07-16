package lesson7_1_copy;

public interface Payable {
    boolean increasePay(int percent);
    final int INCREASE_CAP = 20;
}
