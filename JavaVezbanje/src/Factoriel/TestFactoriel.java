package Factoriel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFactoriel {

    @Test
    public void Test() {
        assertEquals(1, FactorielExample.factoriel(-5));
        assertEquals(1, FactorielExample.factoriel(-1));
        assertEquals(1l, FactorielExample.factoriel(0));
        assertEquals(1l, FactorielExample.factoriel(1));
        assertEquals(7034535277573963776l, FactorielExample.factoriel(25));
    }
}
