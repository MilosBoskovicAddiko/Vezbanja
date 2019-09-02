package Lekcija_35_JUnitTest.test;

import Lekcija_35_JUnitTest.tax.Tax;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class TaxExceptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void testForNegativeGrossIncome() {
        Tax tax = new Tax();
        tax.calcTax(-100,2);
        fail("grossIncome in calcTax() can't be negative");
    }
}
