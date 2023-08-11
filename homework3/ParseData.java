import Exception.CountException;
import Exception.DataException;
import Exception.DateException;
import Exception.SexException;

public class ParseData {

    public String[] parseInputData() throws Exception {
        InputData inputData = new InputData();
        String[] data = inputData.enterData();

        while (data.length != 6) {
            try {
                data = inputData.enterData();
            } catch (CountException e) {
                System.out.println(e.getMessage());
            }
        }

        //Проверка длины Фамилии и имени
        if (data[0].length()==0 || data[1].length()==0) {
            try {
                throw new DataException();
            } catch (DataException e) {
                throw new DataException("Фамилия или имя");
            }
        }

        // Проверка даты
        if (data[3].matches("\\d{1,2}\\.\\d{1,2}\\.\\d{4}")) {
            String[] arrayDate = data[3].split("\\.");
            if (Integer.parseInt(arrayDate[0]) < 0 ||
                    Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) < 0 ||
                    Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) < 0 ||
                    Integer.parseInt(arrayDate[1]) > 2022) {
                try {
                    throw new DateException();
                } catch (DateException e) {
                    throw new DateException(data[3]);
                }
            }
        } else {
            try {
                throw new DateException();
            } catch (DateException e) {
                throw new DateException(data[3]);
            }
        }

        // Проверка пола
        if (!(data[5].equals("f") || data[5].equals("m"))) {
            try {
                throw new SexException();
            } catch (SexException e) {
                throw new SexException(data[5]);
            }
        }

        return data;
    }
}