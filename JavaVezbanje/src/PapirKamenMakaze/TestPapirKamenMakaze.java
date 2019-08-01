package PapirKamenMakaze;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/* Mislim da je ovo negde dovoljno, jer u suprotnom, jedino sto mi je palo na pamet je da pravim po funkciju za svaki od slucajeva koje sam testirao ovde,
* te da umesto true/false vracam ocekivani broj poena coveka ili racunara*/
public class TestPapirKamenMakaze {
    /*Izbori racunara koji se odredjuju random f-jom.
    * 0 - kamen
    * 1 - papir
    * 2 - makaze
    *
    * stoga nema potrebe testirati za unose compijuterskog izbora vece od 2, jer do tog slucaja ne moze doci*/

    @Test
    public void TestPKM() {
        //Testira se ispravno dodavanje poena. Ukoliko je igrac pobedio racunar,test vraca *true*. Za svaku drugu varijantu, vraca false.
        assertEquals(false, KamenPapirMakaze.isParametersEnteredCorrectly("papir", 1)); // papir == papir -> false -> covek:1pts, racunar: 1pts
        assertEquals(false, KamenPapirMakaze.isParametersEnteredCorrectly("Kamen", 1)); // kamen < papir -> false -> covek:0pts, racunar: 2pts
        assertEquals(true, KamenPapirMakaze.isParametersEnteredCorrectly("makaze",1)); // makaze > papir -> true -> covek:2pts, racunar:0pts
        assertEquals(true, KamenPapirMakaze.isParametersEnteredCorrectly("papir", 0)); // papir > kamen -> true -> covek:2pts, racunar: 0pts
        assertEquals(false, KamenPapirMakaze.isParametersEnteredCorrectly("Kamen", 0)); // kamen == kamen -> false -> covek:1pts, racunar: 1pts
        assertEquals(false, KamenPapirMakaze.isParametersEnteredCorrectly("makaze",0)); // makaze < kamen -> false -> covek:0pts, racunar:2pts
        assertEquals(false, KamenPapirMakaze.isParametersEnteredCorrectly("papir", 2)); // papir < makaze -> false -> covek:0pts, racunar: 2pts
        assertEquals(true, KamenPapirMakaze.isParametersEnteredCorrectly("Kamen", 2)); // kamen > makaze -> true -> covek:2pts, racunar: 0pts
        assertEquals(false, KamenPapirMakaze.isParametersEnteredCorrectly("makaze",2)); // makaze == makaze -> false -> covek:1pts, racunar:1pts
        assertEquals(false,KamenPapirMakaze.isParametersEnteredCorrectly("dsa",2)); // nepravilan unos, vraca false

        assertEquals(true,KamenPapirMakaze.isWinnerValid(21,20)); // Testira se pomocna funkcija isWinnerValid za odredjeni proj poena
        assertEquals(false,KamenPapirMakaze.isWinnerValid(21,21));// ukoliko je covek dostigao 21 poena, a racunar imam manje od 21, vraca se *true*,
        assertEquals(false,KamenPapirMakaze.isWinnerValid(20,21));// u svakoj drugoj varijanti vratice false, bilo da covek ili racunar imaju vise poena jedno
        assertEquals(false,KamenPapirMakaze.isWinnerValid(16,15)); //od drugoga ali ne i potrebnih 21. Ukoliko je rezultat neresen takodje vraca *false*

        //assertEquals(true, KamenPapirMakaze.isParametersEnteredCorrectly("Kraj",2));


    }
}
