package Exception;

public class CountException extends RuntimeException{
    public CountException() {
    }

    public CountException(String message) {
        super(String.format("Неверное количество параметров: %s", message));
    }
}