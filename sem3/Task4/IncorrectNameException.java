package Task4;

public class IncorrectNameException extends Exception {

    public IncorrectNameException(String message, Throwable cause) {
        super("Неверное имя файла "+message, cause);
    }
}
