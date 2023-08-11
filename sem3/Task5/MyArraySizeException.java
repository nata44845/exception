package Task5;

public class MyArraySizeException extends RuntimeException {
    
    public MyArraySizeException(int length) {
        super("Размер массива отличен от "+length);
    }
}
