package SkockoSlagalica;

import java.util.Random;

public class Player {
    private JumperPlayClass.PossibleChoices[] playersCombination = new JumperPlayClass.PossibleChoices[4];
    private JumperPlayClass.PossibleChoices[] computersCombination = new JumperPlayClass.PossibleChoices[4];
    private int points = 0;
    private int guessedWell = 0;
    private int onCorrectPosition = 0;
    public static final int NUMBEROFGUESSES = 6;
    public static final int NUMBEROFSIGNS = 4;

    public Player() {
        Random random = new Random();
        for (int i = 0; i < computersCombination.length; i++) {
            int choice = random.nextInt(6);
            computersCombination[i] = JumperPlayClass.PossibleChoices.values()[choice];
        }
    }

    public JumperPlayClass.PossibleChoices[] getPlayersCombination() {
        return playersCombination;
    }

    public void setPlayersCombination(JumperPlayClass.PossibleChoices[] playersCombination) {
        this.playersCombination = playersCombination;
    }

    public JumperPlayClass.PossibleChoices[] getComputersCombination() {
        return computersCombination;
    }

    public void setComputersCombination(JumperPlayClass.PossibleChoices[] computersCombination) {
        this.computersCombination = computersCombination;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGuessedWell() {
        return guessedWell;
    }

    public void setGuessedWell(int guessedWell) {
        this.guessedWell = guessedWell;
    }

    public int getOnCorrectPosition() {
        return onCorrectPosition;
    }

    public void setOnCorrectPosition(int onCorrectPosition) {
        this.onCorrectPosition = onCorrectPosition;
    }


}
