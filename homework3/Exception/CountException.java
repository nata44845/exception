package Exception;

public class CountException extends RuntimeException{
    public CountException() {
    }

    public CountException(String message) {
        super(message);
    }

    public static String getMessage(String i) {
        return String.format("Неверное количество параметров: %s", i);
    }
}