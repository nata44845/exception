package Exception;
public class DataException extends Exception{
    public DataException() {
    }
    
    public DataException(String message) {
        super(message);
    }

    public void dataException(String i) {
        System.out.printf("Data format exception: %s", i);
        System.out.println();
    }
}
