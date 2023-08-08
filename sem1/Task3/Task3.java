package sem1.Task3;
public class Task3 {
     /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива.
    При этом накладываем на метод 2 ограничения: метод может работать
    только с квадратными массивами (кол-во строк = кол-ву столбцов),
    и в каждой ячейке может лежать только значение 0 или 1.
    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */
    public static void main(String[] args) {
        int[][] array = new int[][]{{0,1,0}, {1,1,1}, {0,0,0}};
        try {
            System.out.println("Сумма элементов равна: " + sumArrayItems(array));
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Конец работы приложения");
    }

    private static int sumArrayItems(int[][] array){
        if (array == null){
            throw new RuntimeException("Массив не инициализирован");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length){
                throw new RuntimeException("Массив не квадратный");
            }
            for (int j = 0; j < array[i].length; j++) {
                int item = array[i][j];
                if (item != 0 && item != 1){
                    throw new RuntimeException("Элемент с индексом [" + i + ", " + j + "] " +
                            "равен " + item + ". Ожидается значение 0 или 1");
                }
                sum += item;
            }
        }
        return sum;
    }
}
