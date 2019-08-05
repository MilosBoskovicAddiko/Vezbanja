package SkockoSlagalica;

import java.util.Random;

public class Player {
    private JumperPlayClass.PossibleChoices[] playersCombination = new JumperPlayClass.PossibleChoices[4];
    private JumperPlayClass.PossibleChoices[] computersCombination = new JumperPlayClass.PossibleChoices[4];
    private int points=0;
    private int guessedWell=0;
    private int onCorrectPosition=0;
    private int onIncorrectPosition=0;

    public Player() {
        Random random = new Random();
        int i = 0;
        while (i < computersCombination.length) {
            int choice = random.nextInt(6);
            computersCombination[i] = JumperPlayClass.PossibleChoices.values()[choice];
            i++;
        }
    }

    public JumperPlayClass.PossibleChoices[] getPlayersCombination() {
        return playersCombination;
    }

    public void setPlayersCombination(JumperPlayClass.PossibleChoices[] playersCombination) {
        this.playersCombination = playersCombination;
    }

    public JumperPlayClass.PossibleChoices[] getComputerChoice() {
        return computersCombination;
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

    public int getOnIncorrectPosition() {
        return onIncorrectPosition;
    }

    public void setOnIncorrectPosition(int onIncorrectPosition) {
        this.onIncorrectPosition = onIncorrectPosition;
    }
}
