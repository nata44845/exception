package Exception;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.printf("Date format exception: %s", i);
        System.out.println();
    }
}
