package Exception;
public class DataException extends Exception{
    public DataException() {
    }

    public DataException(String message) {
        super(String.format("Нулевая длина пераметра: %s",message));
    }

    // public String getMessage(String i) {
    //     return String.format("Нулевая длина пераметра: %s", i);
    // }
}
