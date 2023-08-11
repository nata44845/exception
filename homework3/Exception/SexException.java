package Exception;

public class SexException extends Exception {
    public SexException() {
    }

    public SexException(String message) {
        super(String.format("Неверный формат пола (f/m): %s", message));
    }
}
