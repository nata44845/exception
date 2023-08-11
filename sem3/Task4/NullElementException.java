package Task4;

public class NullElementException extends RuntimeException{
    public NullElementException() {
        super("Ссылка на пустой элемент");
    }
}
