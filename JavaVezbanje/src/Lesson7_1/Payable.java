package Lesson7_1;

public interface Payable {
    boolean increasePay(int percent);
    final int INCREASE_CAP = 20;
}
