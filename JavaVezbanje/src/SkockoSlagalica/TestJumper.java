package SkockoSlagalica;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJumper {
    @Test
    public void Test() {

        // Tests for wellGuessed(Player player)
        Player player = new Player();

        JumperPlayClass.PossibleChoices[] computerCombination = {
                JumperPlayClass.PossibleChoices.PIK,
                JumperPlayClass.PossibleChoices.KARO,
                JumperPlayClass.PossibleChoices.TREF,
                JumperPlayClass.PossibleChoices.ZVEZDA};

        JumperPlayClass.PossibleChoices[] humanCombination1 = {
                JumperPlayClass.PossibleChoices.SKOCKO,
                JumperPlayClass.PossibleChoices.SKOCKO,
                JumperPlayClass.PossibleChoices.SKOCKO,
                JumperPlayClass.PossibleChoices.SKOCKO};

        JumperPlayClass.PossibleChoices[] humanCombination2 = {
                JumperPlayClass.PossibleChoices.KARO,
                JumperPlayClass.PossibleChoices.KARO,
                JumperPlayClass.PossibleChoices.KARO,
                JumperPlayClass.PossibleChoices.KARO};

        JumperPlayClass.PossibleChoices[] humanCombination3 = {
                JumperPlayClass.PossibleChoices.KARO,
                JumperPlayClass.PossibleChoices.KARO,
                JumperPlayClass.PossibleChoices.TREF,
                JumperPlayClass.PossibleChoices.KARO};

        JumperPlayClass.PossibleChoices[] humanCombination4 = {
                JumperPlayClass.PossibleChoices.PIK,
                JumperPlayClass.PossibleChoices.KARO,
                JumperPlayClass.PossibleChoices.TREF,
                JumperPlayClass.PossibleChoices.SKOCKO};

        JumperPlayClass.PossibleChoices[] humanCombination5 = {
                JumperPlayClass.PossibleChoices.PIK,
                JumperPlayClass.PossibleChoices.KARO,
                JumperPlayClass.PossibleChoices.TREF,
                JumperPlayClass.PossibleChoices.ZVEZDA};

        player.setComputersCombination(computerCombination);
        player.setPlayersCombination(humanCombination1);
        assertEquals(0,JumperPlayClass.wellGuessed(player)); // human = {skocko, skocko, skocko, skocko} | computer = {pik, karo, tref, zvezda}

        player.setPlayersCombination(humanCombination2);
        assertEquals(1,JumperPlayClass.wellGuessed(player)); // human = {karo, karo, karo, karo} | computer = {pik, karo, tref, zvezda}

        player.setPlayersCombination(humanCombination3);
        assertEquals(2,JumperPlayClass.wellGuessed(player)); // human = {karo, karo, tref, karo} | computer = {pik, karo, tref, zvezda}

        player.setPlayersCombination(humanCombination4);
        assertEquals(3,JumperPlayClass.wellGuessed(player)); // human = {pik, karo, tref, skocko} | computer = {pik, karo, tref, zvezda}

        player.setPlayersCombination(humanCombination5);
        assertEquals(4,JumperPlayClass.wellGuessed(player)); // human = {pik, karo, tref, zvezda} | computer = {pik, karo, tref, zvezda}

        // Test for onCorrectPosition(Player player)
        player.setPlayersCombination(humanCombination1);
        assertEquals(0,JumperPlayClass.onCorrectPosition(player)); // human = {skocko, skocko, skocko, skocko} | computer = {pik, karo, tref, zvezda}
        player.setPlayersCombination(humanCombination2);
        assertEquals(1,JumperPlayClass.onCorrectPosition(player)); // human = {karo, karo, karo, karo} | computer = {pik, karo, tref, zvezda}
        player.setPlayersCombination(humanCombination3);
        assertEquals(2,JumperPlayClass.onCorrectPosition(player)); // human = {karo, karo, tref, karo} | computer = {pik, karo, tref, zvezda}
        player.setPlayersCombination(humanCombination4);
        assertEquals(3,JumperPlayClass.onCorrectPosition(player)); // human = {pik, karo, tref, skocko} | computer = {pik, karo, tref, zvezda}
        player.setPlayersCombination(humanCombination5);
        assertEquals(4,JumperPlayClass.onCorrectPosition(player)); // human = {pik, karo, tref, zvezda} | computer = {pik, karo, tref, zvezda}

        // Tests for isHumanWinner(PossibleChoices humanCombination, PossibleChoices computerCombinatio)
        assertEquals(true, JumperPlayClass.isHumanWinner(humanCombination5,computerCombination)); // human = {pik, karo, tref, zvezda} | computer = {pik, karo, tref, zvezda}
        assertEquals(false, JumperPlayClass.isHumanWinner(humanCombination1,computerCombination)); // human = {skocko, skocko, skocko, skocko} | computer = {pik, karo, tref, zvezda}

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

        // Tests for setChoices(int choice)
        assertEquals(JumperPlayClass.PossibleChoices.SKOCKO, JumperPlayClass.setChoices(1));
        assertEquals(JumperPlayClass.PossibleChoices.ZVEZDA, JumperPlayClass.setChoices(2));
        assertEquals(JumperPlayClass.PossibleChoices.KARO, JumperPlayClass.setChoices(3));
        assertEquals(JumperPlayClass.PossibleChoices.PIK, JumperPlayClass.setChoices(4));
        assertEquals(JumperPlayClass.PossibleChoices.HERC, JumperPlayClass.setChoices(5));
        assertEquals(JumperPlayClass.PossibleChoices.TREF, JumperPlayClass.setChoices(6));
        assertEquals(null, JumperPlayClass.setChoices(0));
        assertEquals(null, JumperPlayClass.setChoices(7));

        // Tests for setPoints(int counter)
        assertEquals(20, JumperPlayClass.setPoints(0)); // first try
        assertEquals(15, JumperPlayClass.setPoints(1)); // second try
        assertEquals(15, JumperPlayClass.setPoints(2)); // third try
        assertEquals(10, JumperPlayClass.setPoints(3)); // fourth try
        assertEquals(10, JumperPlayClass.setPoints(4)); // fifth try
        assertEquals(5, JumperPlayClass.setPoints(5)); // sixth try










    }

}
