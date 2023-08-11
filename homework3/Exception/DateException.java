package Exception;

public class DateException extends Exception {
    public DateException() {
    }

    public DateException(String message) {
        super(message);
    }

    public void dataException(String i) {
        System.out.printf("Неверный формат даты: %s", i);
        System.out.println();
    }
}
