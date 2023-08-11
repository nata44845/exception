package Exception;

public class SexException extends Exception {
    public SexException() {
    }

    public SexException(String message) {
        super(message);
    }

    public String getMessage(String i) {
        return String.format("Неверный формат пола (f/m): %s", i);

    }
}
