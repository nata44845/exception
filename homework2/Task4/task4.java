package Task4;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task4 {

    public static void main(String[] args) {
        try {
            getString();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static void getString() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String str= scanner.nextLine();
            if (str == "") {
                throw new RuntimeException("Введена пустая строка");
            } 
        } catch (Exception e) { 
            System.out.println(e);
        }
        finally {
            if (scanner != null) scanner.close();
        }

    }
}
