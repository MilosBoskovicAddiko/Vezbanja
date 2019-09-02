package Lekcija_35_JUnitTest.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TaxExceptionTest.class, TaxTest.class})
public class AllTests {
}
