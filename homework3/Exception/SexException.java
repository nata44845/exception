package Exception;

public class SexException extends Exception {
    public SexException() {
    }

    public SexException(String message) {
        super(message);
    }

    public void sexException(String i) {
        System.out.printf("Ошибочный параметр: %s", i);
        System.out.println();
    }
}
