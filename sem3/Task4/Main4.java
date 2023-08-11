package Task4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* Создайте класс исключения, который будет выбрасываться при делении на 0
Исключение должно отображать понятное для пользователя сообщение об ошибке

Создайте класс исключения, который будет возникать при обращении к пустому элементу в массиве ссылочного типа
Исключение должно отображать понятное для пользователя сообщение об ошибке

Создайте класс исключения, который будет возникать при попытке открыть несуществующий файл
Исключение должно отображать понятное для пользователя сообщение об ошибке */
public class Main4 {
    public static void main(String[] args) {
        try {
            System.out.println(getResult(10, 2));
        } catch (DivisionByZeroException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(getArrayItem(new String[] {"1","2","3","4"}, 0));
        } catch (NullElementException e) {
            System.out.println(e.getMessage());
        }

        try {
            readFile("text1.txt");
        } catch (IncorrectNameException e) {
            e.printStackTrace();
        }
    }

    public static double getResult(int a, int b) {
        if (b == 0) throw new DivisionByZeroException();
        return a/b;
    }

    public static String getArrayItem(String[] array, int x) {
        if (x > array.length) throw new NullElementException();
        return array[x];
    }

    public static void readFile(String path) throws IncorrectNameException {
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
        } catch (IOException e) {
            throw new IncorrectNameException(path, e);
        }
           
        
    }
}
