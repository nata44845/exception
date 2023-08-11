/**
 * main
 */
public class Main {

        public static void main(String[] args) {
            ParseData parseData = new ParseData(); 
            boolean flag = false;
            String[] data = null;

            while (!flag) {
                try {
                    data = parseData.parseInputData();
                    flag = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } 
    
            String fileName = data[0] + ".txt"; 
            SaveService saveService = new SaveService(fileName); 
            
            StringBuilder sb = new StringBuilder();
            for (String str : data) {
                sb.append(str);
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