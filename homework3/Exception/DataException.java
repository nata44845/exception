package Exception;
public class DataException extends Exception{

    public DataException(String message) {
        super(String.format("Нулевая длина параметра: %s",message));
    }
}
