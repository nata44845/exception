package Task5;

public class ArrayDataException extends RuntimeException {

    public ArrayDataException(String message) {
        super("Неверные данные в ячейке "+message);
    }
}
