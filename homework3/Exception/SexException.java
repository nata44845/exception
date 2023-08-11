package Exception;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.printf("Sex exception: %s", i);
        System.out.println();
    }
}
