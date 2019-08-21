package Lekcija_10_Exception_Handling.CreationOwnException;

public class TooManyBikesException extends Exception {
    public TooManyBikesException(String message) {
        super(message);
    }
}
