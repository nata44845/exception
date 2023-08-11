package Task3;

import java.io.IOException;

/* Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней int переменной на 1.
Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources
Подумайте, что должно происходить при закрытии этого ресурса
Напишите метод для проверки закрыт ли ресурс
При попытке вызвать метод add() у закрытого ресурса должен выброситься IOException */
public class Counter implements AutoCloseable {
    private int count;
    private boolean closed = false;

    public void add() throws IOException {
        if (closed) {
            throw new IOException("Ресурс закрыт и не может быть использован");
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    public boolean isClosed() {
        return closed;
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Ресурс закрыт");
    }
}
