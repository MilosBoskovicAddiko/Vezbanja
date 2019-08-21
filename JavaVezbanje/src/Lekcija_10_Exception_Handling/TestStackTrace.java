package Lekcija_10_Exception_Handling;

public class TestStackTrace {
    public TestStackTrace() {
        divideByZero();
    }

    int divideByZero() {
        return 25 / 0;
    }

    public static void main(String[] args) {
        new TestStackTrace();
    }
}
