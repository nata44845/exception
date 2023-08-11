package Exception;

public class CountException extends Exception{
    public CountException() {
    }

    public CountException(String message) {
        super(String.format("Неверное количество параметров: %s", message));
    }
}