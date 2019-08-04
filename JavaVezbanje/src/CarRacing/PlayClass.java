package CarRacing;

import java.util.Scanner;

//TODO - prebaci na citanje iz fajla
public class PlayClass {

    public static void main(String[] args) {

        CarRacing carRacing = new CarRacing();

        System.out.println("Welcome to the RacingGame!!!");
        System.out.println("To go forward press 's', to turn left press 'a' and to turn right press 'd', all followed by 'Enter'");
        System.out.print("Press any key followed by 'Enter' to start the race-timer: ");

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // It's not important for the program flow, it's just there in order to start race-timer,
        // so there's no need for assigning this value to any variable

        long startTime = System.currentTimeMillis();  // starting race timer
        long endTime;
        double timeElapsed;
        System.out.print(carRacing.getTrack()[0]);

        int i = 1;
        while (i < carRacing.getTrack().length) {
            carRacing.setCurrentLeftBoudary(carRacing.getTrackLine(i).indexOf("*")); // keep track of current left boundary of the road
            carRacing.setCurrentRightBoundary(carRacing.getTrackLine(i).lastIndexOf("*")); // keep track of current right boundary of the road
            char[] input = scanner.nextLine().toCharArray();

            if (isInputValid(input)) {
                switch (input[0]) {
                    case 'a':
                    case 'A':
                        carRacing.setCurrentIndexOfCar(carRacing.getPrevIndexOfCar() - 1); // setting current index of car depending of previous position and
                                                                                           // your choice
                        carRacing.setPrevIndexOfCar(carRacing.getCurrentIndexOfCar());     // setting previous index of car to current index of car, for the
                                                                                           // next iteration
                        playOrDie(carRacing, startTime, i, carRacing.getCurrentLeftBoudary());
                        i++;
                        break;
                    case 's':
                    case 'S':
                        carRacing.setCurrentIndexOfCar(carRacing.getPrevIndexOfCar());
                        carRacing.setPrevIndexOfCar(carRacing.getCurrentIndexOfCar());
                        playOrDie(carRacing, startTime, i, carRacing.getCurrentIndexOfCar());
                        i++;
                        break;
                    case 'd':
                    case 'D':
                        carRacing.setCurrentIndexOfCar(carRacing.getPrevIndexOfCar() + 1);
                        carRacing.setPrevIndexOfCar(carRacing.getCurrentIndexOfCar());
                        playOrDie(carRacing, startTime, i, carRacing.getCurrentRightBoundary());
                        i++;
                        break;
                }
                if (carRacing.getGameOver()) {
                    break;
                }
            }
        }
        if (!carRacing.getGameOver()) {
            endTime = System.currentTimeMillis();
            timeElapsed = (endTime - startTime) / 1000.;
            System.out.println("\nCongratulations, You win!!!");
            System.out.println("Time elapsed: " + timeElapsed + " seconds");
        }
    }

    /**
     * Method checks if game is over calling helper function isGameOver that accepts instance of CarRacing class that
     * returns true, if left boudary of the road is bigger or equal to currentIndexOfCar or if right boundary of the
     * road is less or equal to currentIndexOfCar. If this condition is true, that means the game is over, and it prints
     * notifications about elapsed time, and also it sets boolean parameter named gameOver of CarRacing class to true. Otherwise,
     * it's moving car to the position that player has chosen.
     *
     * @param carRacing      current instance of carRacing class
     * @param startTime      time in milliseconds when the game has started
     * @param i              current loop counter value
     * @param currentBoudary current boudary that depends of your choice - left / right
     */
    private static void playOrDie(CarRacing carRacing, long startTime, int i, int currentBoudary) {
        long endTime;
        double timeElapsed;
        if (isGameOver(carRacing)) {
            endTime = System.currentTimeMillis();
            timeElapsed = (endTime - startTime) / 1000.0;
            carRacing.setTrackLine(i, carRacing.getTrackLine(i).substring(0, currentBoudary) + "X" + carRacing.getTrackLine(i).substring(currentBoudary + 1));
            System.out.print(carRacing.getTrackLine(i));
            System.out.println("\nGAME OVER!!!");
            System.out.println("Time elapsed: " + timeElapsed + " seconds");
            carRacing.setGameOver(true);
        } else {
            carRacing.setTrackLine(i, carRacing.getTrackLine(i).substring(0, carRacing.getCurrentIndexOfCar()) + "V" + carRacing.getTrackLine(i).substring(carRacing.getCurrentIndexOfCar() + 1));
            System.out.print(carRacing.getTrackLine(i));
        }
    }

    /**
     * Method checks if console input is valid by checking if length of input array is equal to 1, and if it's true, than
     * it checks if input is a letter
     *
     * @param input input that player has entered in console
     * @return <code> true </code> if input is a single letter, otherwise <code>false</code>
     */
    private static boolean isInputValid(char[] input) {
        if (input.length == 1 && Character.isLetter(input[0])) {
            return true;
        }
        return false;
    }

    /**
     * Method simply checks if car is on the road by asking is current index of car between indexes of left and right boundary of the road
     *
     * @param carRacing current instance of carRacing class
     * @return <code>true</code> if position of car is between left and right boundary of the road, otherwise <code>false</code>
     */
    private static boolean isGameOver(CarRacing carRacing) {
        if (carRacing.getCurrentLeftBoudary() >= carRacing.getCurrentIndexOfCar() || carRacing.getCurrentRightBoundary() <= carRacing.getCurrentIndexOfCar()) {
            return true;
        }
        return false;
    }
}
