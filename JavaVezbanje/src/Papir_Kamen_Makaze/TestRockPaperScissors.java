package Papir_Kamen_Makaze;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestRockPaperScissors {
    @Test
    public void TestPlan() {

        // Test slucajevi za ispitivanje da li se igra tie break ili u slucaju da jos nemamo pobednika
        assertEquals(true, RockPaperScissors.notAnEndOrTieBreak(15, 15));
        assertEquals(true, RockPaperScissors.notAnEndOrTieBreak(25, 25));
        assertEquals(false, RockPaperScissors.notAnEndOrTieBreak(22, 21));
        assertEquals(false, RockPaperScissors.notAnEndOrTieBreak(21, 22));

        // Test slucajevi za ispitivanje da li je kraj igre
        assertEquals(true, RockPaperScissors.isEnd(21, 20));
        assertEquals(true, RockPaperScissors.isEnd(21, 22));

        assertEquals(false, RockPaperScissors.isEnd(22, 22));
        assertEquals(false, RockPaperScissors.isEnd(15, 10));
        assertEquals(false, RockPaperScissors.isEnd(10, 15));

        // Test slucajevi za ispitivanje validnog unosa
        assertEquals(true, RockPaperScissors.isInputValid("1"));
        assertEquals(true, RockPaperScissors.isInputValid("2"));
        assertEquals(true, RockPaperScissors.isInputValid("3"));
        assertEquals(true, RockPaperScissors.isInputValid("4"));

        assertEquals(false, RockPaperScissors.isInputValid("12"));
        assertEquals(false, RockPaperScissors.isInputValid("dsa"));
        assertEquals(false, RockPaperScissors.isInputValid("a"));
        assertEquals(false, RockPaperScissors.isInputValid(""));

        // Test slucajevi za ispitivanje pravilnog setovanja izbora
        // Test ce proci za unos bilo koje cifre, ali se to u programu
        // ne moze desiti usled validacije unosa
        assertEquals(RockPaperScissors.PossibleChoices.ROCK, RockPaperScissors.setChoice(1));
        assertEquals(RockPaperScissors.PossibleChoices.PAPER, RockPaperScissors.setChoice(2));
        assertEquals(RockPaperScissors.PossibleChoices.SCISSORS, RockPaperScissors.setChoice(3));
        assertEquals(RockPaperScissors.PossibleChoices.EXIT, RockPaperScissors.setChoice(4));


    }
}
