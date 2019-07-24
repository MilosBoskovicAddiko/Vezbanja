package Lekcija_10.CreationOwnException;

public class TooManyBikesException extends Exception {
    public TooManyBikesException(String message) {
        super(message);
    }
}
