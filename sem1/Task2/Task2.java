package sem1.Task2;
import java.util.*;

public class Task2 {
    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив
    и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс.
    При этом, например:
    если длина массива меньше некоторого заданного минимума, метод возвращает -1,
    в качестве кода ошибки.
    если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
    если вместо массива пришел null, метод вернет -3
    придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
    Напишите метод, в котором реализуйте взаимодействие с пользователем.
    То есть, этот метод запросит искомое число у пользователя, вызовет первый,
    обработает возвращенное значение и покажет читаемый результат пользователю.
    Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
     */
    public static void main(String[] args) {
        Integer[] array = new Integer[]{2,6,7,63};
        speak(array);
    }

    private static void speak(Integer[] array) {
        System.out.println("Укажите искомое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int code = check(array, num);
        parseCode(code);
    }

    private static void parseCode(int code) {
        switch (code){
            case -1:
                System.out.println("Длинна массива меньше минимального необходимого");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            case -3:
                System.out.println("Массив не инициализирован");
                break;
            case -4:
                System.out.println("Искомое число больше максимального в массиве");
                break;
            case -5:
                System.out.println("Искомое число меньше минимального в массиве");
                break;
            default:
                System.out.println("Индекс элемента равен: " + code);
        }
    }

    private static int check(Integer[] arr, int num){
        if (arr == null){
            return -3;
        }
        int minLength = 5;
        if (arr.length < minLength){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        int max = Collections.max(Arrays.asList(arr));
        int min = Collections.min(Arrays.asList(arr));
        if (num > max){
            return -4;
        }
        if (num < min){
            return -5;
        }
        return -2;
    }
}
