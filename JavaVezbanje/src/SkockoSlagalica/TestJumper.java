package SkockoSlagalica;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJumper {
    @Test
    public void Test() {

        // Tests for wellGuessed(Player player)
        PossibleChoices[] computerCombination = {
                PossibleChoices.PIK,
                PossibleChoices.KARO,
                PossibleChoices.TREF,
                PossibleChoices.ZVEZDA};

        PossibleChoices[] humanCombination1 = {
                PossibleChoices.SKOCKO,
                PossibleChoices.SKOCKO,
                PossibleChoices.SKOCKO,
                PossibleChoices.SKOCKO};

        PossibleChoices[] humanCombination2 = {
                PossibleChoices.KARO,
                PossibleChoices.KARO,
                PossibleChoices.KARO,
                PossibleChoices.KARO};

        PossibleChoices[] humanCombination3 = {
                PossibleChoices.KARO,
                PossibleChoices.KARO,
                PossibleChoices.TREF,
                PossibleChoices.KARO};

        PossibleChoices[] humanCombination4 = {
                PossibleChoices.PIK,
                PossibleChoices.KARO,
                PossibleChoices.TREF,
                PossibleChoices.SKOCKO};

        PossibleChoices[] humanCombination5 = {
                PossibleChoices.PIK,
                PossibleChoices.KARO,
                PossibleChoices.TREF,
                PossibleChoices.ZVEZDA};

        assertEquals(0, JumperPlayClass.wellGuessed(humanCombination1, computerCombination)); // human = {skocko, skocko, skocko, skocko} | computer = {pik, karo, tref, zvezda}
        assertEquals(1, JumperPlayClass.wellGuessed(humanCombination2, computerCombination)); // human = {karo, karo, karo, karo} | computer = {pik, karo, tref, zvezda}
        assertEquals(2, JumperPlayClass.wellGuessed(humanCombination3, computerCombination)); // human = {karo, karo, tref, karo} | computer = {pik, karo, tref, zvezda}
        assertEquals(3, JumperPlayClass.wellGuessed(humanCombination4, computerCombination)); // human = {pik, karo, tref, skocko} | computer = {pik, karo, tref, zvezda}
        assertEquals(4, JumperPlayClass.wellGuessed(humanCombination5, computerCombination)); // human = {pik, karo, tref, zvezda} | computer = {pik, karo, tref, zvezda}

        // Test for onCorrectPosition(Player player)
        assertEquals(0, JumperPlayClass.onCorrectPosition(humanCombination1, computerCombination)); // human = {skocko, skocko, skocko, skocko} | computer = {pik, karo, tref, zvezda}
        assertEquals(1, JumperPlayClass.onCorrectPosition(humanCombination2, computerCombination)); // human = {karo, karo, karo, karo} | computer = {pik, karo, tref, zvezda}
        assertEquals(2, JumperPlayClass.onCorrectPosition(humanCombination3, computerCombination)); // human = {karo, karo, tref, karo} | computer = {pik, karo, tref, zvezda}
        assertEquals(3, JumperPlayClass.onCorrectPosition(humanCombination4, computerCombination)); // human = {pik, karo, tref, skocko} | computer = {pik, karo, tref, zvezda}
        assertEquals(4, JumperPlayClass.onCorrectPosition(humanCombination5, computerCombination)); // human = {pik, karo, tref, zvezda} | computer = {pik, karo, tref, zvezda}

        // Tests for isHumanWinner(PossibleChoices humanCombination, PossibleChoices computerCombinatio)
        assertEquals(true, JumperPlayClass.isCombinationCorrect(humanCombination5, computerCombination)); // human = {pik, karo, tref, zvezda} | computer = {pik, karo, tref, zvezda}
        assertEquals(false, JumperPlayClass.isCombinationCorrect(humanCombination1, computerCombination)); // human = {skocko, skocko, skocko, skocko} | computer = {pik, karo, tref, zvezda}

        // Tests for isInputValid(String input)
        assertEquals(false, JumperPlayClass.isInputValid("0"));
        assertEquals(true, JumperPlayClass.isInputValid("1"));
        assertEquals(true, JumperPlayClass.isInputValid("2"));
        assertEquals(true, JumperPlayClass.isInputValid("3"));
        assertEquals(true, JumperPlayClass.isInputValid("4"));
        assertEquals(true, JumperPlayClass.isInputValid("5"));
        assertEquals(true, JumperPlayClass.isInputValid("6"));
        assertEquals(false, JumperPlayClass.isInputValid("7"));
        assertEquals(false, JumperPlayClass.isInputValid("62"));
        assertEquals(false, JumperPlayClass.isInputValid("ds"));
        assertEquals(false, JumperPlayClass.isInputValid("/"));
    }
}
