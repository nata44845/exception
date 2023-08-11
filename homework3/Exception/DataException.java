package Exception;
public class DataException extends Exception{
    public DataException() {
    }

    public DataException(String message) {
        super(message);
    }

    public static String getMessage(String i) {
        return String.format("Нулевая длина пераметра: %s", i);
    }
}
