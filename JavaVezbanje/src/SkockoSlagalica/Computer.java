package SkockoSlagalica;

import java.util.Random;

public class Computer {
    private PossibleChoices[] computersCombination = new PossibleChoices[4];

    public Computer() {
        Random random = new Random();
        for (int i = 0; i < computersCombination.length; i++) {
            int choice = random.nextInt(6);
            computersCombination[i] = PossibleChoices.values()[choice];
        }
    }

    public PossibleChoices[] getComputersCombination() {
        return computersCombination;
    }

    public void setComputersCombination(PossibleChoices[] computersCombination) {
        this.computersCombination = computersCombination;
    }
}
