package Task4;

public class DivisionByZeroException extends RuntimeException {

    public DivisionByZeroException() {
        super("Нельзя делить на ноль");
    }

}
