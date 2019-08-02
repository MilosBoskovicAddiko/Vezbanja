package Papir_Kamen_Makaze;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestKamenPapirMakaze {
    @Test
    public void TestPlan() {

        // Test slucajevi za ispitivanje da li se igra tie break ili u slucaju da jos nemamo pobednika
        assertEquals(true, KamenPapirMakaze.nijeKrajIliTajBrejk(15, 15));
        assertEquals(true, KamenPapirMakaze.nijeKrajIliTajBrejk(21, 21));
        assertEquals(false, KamenPapirMakaze.nijeKrajIliTajBrejk(22, 21));
        assertEquals(false, KamenPapirMakaze.nijeKrajIliTajBrejk(21, 22));

        // Test slucajevi za ispitivanje da li je kraj igre
        assertEquals(true, KamenPapirMakaze.jeKraj(21, 20));
        assertEquals(true, KamenPapirMakaze.jeKraj(21, 22));

        assertEquals(false, KamenPapirMakaze.jeKraj(22, 22));
        assertEquals(false, KamenPapirMakaze.jeKraj(15, 10));
        assertEquals(false, KamenPapirMakaze.jeKraj(10, 15));

        // Test slucajevi za ispitivanje validnog unosa
        assertEquals(true, KamenPapirMakaze.unosValidan("1"));
        assertEquals(true, KamenPapirMakaze.unosValidan("2"));
        assertEquals(true, KamenPapirMakaze.unosValidan("3"));
        assertEquals(true, KamenPapirMakaze.unosValidan("4"));

        assertEquals(false, KamenPapirMakaze.unosValidan("12"));
        assertEquals(false, KamenPapirMakaze.unosValidan("dsa"));
        assertEquals(false, KamenPapirMakaze.unosValidan("a"));
        assertEquals(false, KamenPapirMakaze.unosValidan(""));

        // Test slucajevi za ispitivanje pravilnog setovanja izbora
        // Test ce proci za unos bilo koje cifre, ali se to u programu
        // ne moze desiti usled validacije unosa
        assertEquals(KamenPapirMakaze.MoguciIzbori.KAMEN, KamenPapirMakaze.setovanjeIzbora(1));
        assertEquals(KamenPapirMakaze.MoguciIzbori.PAPIR, KamenPapirMakaze.setovanjeIzbora(2));
        assertEquals(KamenPapirMakaze.MoguciIzbori.MAKAZE, KamenPapirMakaze.setovanjeIzbora(3));
        assertEquals(KamenPapirMakaze.MoguciIzbori.KRAJ, KamenPapirMakaze.setovanjeIzbora(4));


    }
}
