package Lekcija_35_JUnitTest.tax;

import Lekcija_35_JUnitTest.test.AllTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;

public class TaxCommandLineRunner {

    public static void main(String[] args) {

        JUnitCore jUnitCore = new JUnitCore();
        Result result = jUnitCore.run(AllTests.class);
         if(result.wasSuccessful()) {
             System.out.println("All Tax Test cases ran successfully");
         } else {
             System.out.println("These Tax Test cases failed");
             List<Failure> failedTests = result.getFailures();
             failedTests.forEach(failure -> System.out.println(failure.getMessage()));
         }
    }
}
