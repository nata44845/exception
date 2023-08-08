package task1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] ints = new int[10];
        System.out.println(ints[1000]);
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10/0;
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
         int x = Integer.parseInt("A"); 
 }
}

public class task1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}