import Exception.DataException;
import Exception.DateException;
import Exception.SexException;

public class ParseData {

    public String[] parseInputData() throws Exception {
        InputData inputData = new InputData();
        String[] data = inputData.enterData();

        while (data == null) {
            System.out.println("Неверное количество параметров");
            data = inputData.enterData();
        }

        //Проверка длины Фамилии и имени
        if (data[0].length()==0 || data[1].length()==0) {
            throw new DataException("Фамилия или имя");
        }

        // Проверка даты
        if (data[3].matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
            String[] arrayDate = data[3].split("\\.");
            if (Integer.parseInt(arrayDate[0]) < 0 ||
                    Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) < 0 ||
                    Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) < 0 ||
                    Integer.parseInt(arrayDate[1]) > 2022) {
                throw new DateException(data[3]);
            }
        } else {
            throw new DateException(data[3]);
        }

        //Проверка телефона
        if (!data[4].matches("[0-9]+")) {

        }

        // Проверка пола
        if (!(data[5].equals("f") || data[5].equals("m"))) {
            throw new NumberFormatException(data[4]);
        }

        return data;
    }
}