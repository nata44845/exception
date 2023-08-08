package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        getFloat();
    }

    public static void getFloat() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            float num = scanner.nextFloat();
            System.out.println(num);
        } catch (InputMismatchException e) { 
            System.out.println("Ошибка ввода");
        } catch (Exception e) { 
            System.out.println(e);
        }
        finally {
            if (scanner != null) scanner.close();
        }

    }
}
