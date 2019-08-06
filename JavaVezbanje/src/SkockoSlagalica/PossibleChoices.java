package SkockoSlagalica;

public enum PossibleChoices {
    SKOCKO(1),
    ZVEZDA(2),
    KARO(3),
    PIK(4),
    HERC(5),
    TREF(6);

    private final int id;

    PossibleChoices(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
