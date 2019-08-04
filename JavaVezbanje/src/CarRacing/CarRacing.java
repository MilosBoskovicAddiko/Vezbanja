package CarRacing;

public class CarRacing {

    private String[] track = {"*  V  * - 0 met",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " *     *",
            "  *     *",
            "  *     *",
            "  *     *",
            " *     * - 10 met",
            "*     *",
            "*     *",
            " *     *",
            "  *     *",
            "   *     *",
            "    *     *",
            "     *     *",
            "     *     *",
            "     *     *",
            "     *     * - 20 met",
            "     *     *",
            "    *     *",
            "   *     *",
            "   *     *",
            "   *     *",
            "  *     *",
            " *     *",
            "*     *",
            "*     *",
            "*     * - 30 met",
            " *     *",
            "  *     *",
            "   *     *",
            "    *     *",
            "     *     *",
            "     *     *",
            "     *     *",
            "      *     *",
            "       *     *",
            "        *     * - 40 met",
            "        *     *",
            "        *     *",
            "        *     *",
            "        *     *",
            "        *     *",
            "       *     *",
            "      *     *",
            "     *     *",
            "     *     *",
            "     *     * - FINISH"};

    private int prevIndexOfCar = track[0].indexOf("V");
    private int currentIndexOfCar;
    private int currentLeftBoudary;
    private int currentRightBoundary;
    private boolean isGameOver = false;

    public CarRacing() {
    }

    public String[] getTrack() {
        return track;
    }

    public void setTrackLine(int i, String track) {
        this.track[i] = track;
    }

    public String getTrackLine(int i) {
        return track[i];
    }

    public int getCurrentIndexOfCar() {
        return currentIndexOfCar;
    }

    public void setCurrentIndexOfCar(int currentIndexOfCar) {
        this.currentIndexOfCar = currentIndexOfCar;
    }

    public int getPrevIndexOfCar() {
        return prevIndexOfCar;
    }

    public void setPrevIndexOfCar(int prevIndexOfCar) {
        this.prevIndexOfCar = prevIndexOfCar;
    }

    public int getCurrentLeftBoudary() {
        return currentLeftBoudary;
    }

    public void setCurrentLeftBoudary(int currentLeftBoudary) {
        this.currentLeftBoudary = currentLeftBoudary;
    }

    public int getCurrentRightBoundary() {
        return currentRightBoundary;
    }

    public void setCurrentRightBoundary(int currentRightBoundary) {
        this.currentRightBoundary = currentRightBoundary;
    }

    public boolean getGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }
}
