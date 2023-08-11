import java.util.HashMap;

import Exception.DataException;

/**
 * main
 */
public class Main {

        public static void main(String[] args) {
            ParseData parseData = new ParseData(); 
            InputData inputData = new InputData();
            String[] data = new InputData().enterData();
    
            HashMap<String, Object> data = parseData.parseInputData(data); 
            while (data.size() != 6) {
                try {
                    throw new DataException();
                } catch (DataException e) {
                    data = parseData.parseInputData();
                }
            } 
    
            String fileName = data.get("lastName") + ".txt"; 
            SaveService saveService = new SaveService(fileName); 
            
            StringBuilder sb = new StringBuilder();
            for (String str : data.keySet()) {
                sb.append(data.get(str));
                sb.append(" ");
            }
    
            System.out.println(data);
            System.out.println(fileName);
            try {
                saveService.saveData(sb.toString());
            } catch (Exception e) {
                System.out.println("Ошибка сохранения данных "+e);
            }
                 
            
    
        }

    
}