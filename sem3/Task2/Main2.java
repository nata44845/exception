package Task2;

import java.io.IOException;

public class Main2 {
/*
 * Создайте метод, который может быть источником одного из типов checkedException
 * Вызовите этот метод в main и обработайте в нем исключение, которое вызвал метод
 */
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    static void test() throws IOException {
        
    }
}
