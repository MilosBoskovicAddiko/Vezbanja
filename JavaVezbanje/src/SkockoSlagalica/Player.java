package SkockoSlagalica;

public class Player {
    private PossibleChoices[] playersCombination = new PossibleChoices[4];
    private int points = 0;
    private int guessedWell = 0;
    private int onCorrectPosition = 0;
    public static final int NUMBEROFGUESSES = 6;
    public static final int NUMBEROFSIGNS = 4;

    public Player() {
    }

    public PossibleChoices[] getPlayersCombination() {
        return playersCombination;
    }

    public void setPlayersCombination(PossibleChoices[] playersCombination) {
        this.playersCombination = playersCombination;
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
