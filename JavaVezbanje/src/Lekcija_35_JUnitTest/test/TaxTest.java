package Lekcija_35_JUnitTest.test;

import Lekcija_35_JUnitTest.tax.Tax;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaxTest {

    static Tax tax;

    //@Before
    @BeforeClass
    public static void setUp() {
        tax = new Tax();
        System.out.println("In setUp");
    }

    @Test
    public void testZeroTax() {
        Assert.assertEquals("Tax on zero income us not zero", 0, tax.calcTax(0, 0), 0);
    }

    @Test
    public void testOneStudentDeductionIs300() {
        Assert.assertEquals("The $300 student discount was not applied", 2000, tax.applyStudentDeduction(2300, 1), 0);
    }

    //@After
    @AfterClass
    public static void tearDown() {
        System.out.println("In tearDown");
    }
}
