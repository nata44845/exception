package Exception;

public class DateException extends Exception {
    public DateException() {
    }

    public DateException(String message) {
        super(String.format("Неверный формат даты: %s", message));
    }
}
