package Papir_Kamen_Makaze;

public class Player {
    private int numOfPoints = 0;
    private RockPaperScissors.PossibleChoices choice;

    public Player() { }

    public int getNumOfPoints() {
        return numOfPoints;
    }

    public void setNumOfPoints(int numOfPoints) {
        this.numOfPoints = numOfPoints;
    }

    public RockPaperScissors.PossibleChoices getChoice() {
        return choice;
    }

    public void setChoice(RockPaperScissors.PossibleChoices choice) {
        this.choice = choice;
    }

}
