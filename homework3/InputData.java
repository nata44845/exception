import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через пробел(Фамилия Имя Отчество, дата рождения, номер телефона, пол): ");
            String data = scanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("you have not entered all the data, please try again");
            } else System.out.println("you entered more data, please try again");
        }

    }
}
