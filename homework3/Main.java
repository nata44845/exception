import java.util.HashMap;

/**
 * main
 */
public class Main {

        public static void main(String[] args) {
            ParseData parseData = new ParseData(); 
            String newFileName = null; 
            SaveService saveService = new SaveService(); 
    
            HashMap<String, Object> data = parseData.parseInputData(); // Иннициализация словаря
            while (data.size() != 6) {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    data = parsData.parsInputData();
                }
            } 
    
            newFileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
            StringBuilder sb = new StringBuilder();
            for (String str : data.keySet()) {
                sb.append(data.get(str));
                sb.append(" ");
            }
    
    
            System.out.println(data);
            String filePath = newFileName;
            System.out.println(filePath);
            writeFile.writeData(String.valueOf(sb), filePath); // Вызывается метод класса WriteFile для записи в файл
    
        }

    
}