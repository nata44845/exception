import java.util.Scanner;

import Exception.CountException;

public class InputData {

    public String[] enterData() {
        Scanner scanner = null;
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Введите строку через пробел(Фамилия Имя Отчество, дата рождения, номер телефона, пол): ");
            String data = scanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else {
                throw new CountException(CountException.getMessage(" "+arrayData.length));
            }
        }
    }
}
