package Task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    /*
    Анна=4
    Елена=5
    Марина=6
    Владимир=?
    Константин=?
    Иван=4
    Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
    (либо HashMap, если студенты с ним знакомы).
    В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
    заменить его на соответствующее число.
    Если на каком-то месте встречается символ, отличный от числа или ?,
    бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
     */
    public static void main(String[] args) {
        readAndWrite();
    }

    private static void readAndWrite(){
        try {
            Map<String, String> map = readFile("test.txt");
            changeText(map);
            saveToFile("test1.txt", map);
        } catch (FileNotFoundException e) {
            System.out.println("Прочитать файл не удалось");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Записать в файл не удалось");
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void saveToFile(String file, Map<String, String> map) throws IOException {
        FileWriter writer = new FileWriter(file);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            writer.write(entry.toString());
            writer.write("\n");
            writer.flush();
        }
        writer.close();
    }

    private static Map<String, String> readFile(String filePath) throws FileNotFoundException {
        Map<String, String> map = new HashMap<>();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split("=");
            map.put(strings[0], strings[1]);
        }
        return map;
    }

    private static void changeText(Map<String, String> map) throws IllegalArgumentException {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("?")) {
                map.put(entry.getKey(), String.valueOf(entry.getKey().length()));
            } else if (!entry.getValue().matches("[0-9]+")){
                throw new IllegalArgumentException("Неподходящее значение в строке: " + entry);
            }
        }
    }
}