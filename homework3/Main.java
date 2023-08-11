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

            StringBuilder sb = new StringBuilder();
            for (String str : data) {
                sb.append(str);
                sb.append(" ");
            }
    
            String fileName = data[0] + ".txt"; 
            SaveService saveService = new SaveService(fileName);             
    
            try {
                saveService.saveData(sb.toString());
                System.out.println("Данные сохранены");
            } catch (Exception e) {
                System.out.println("Ошибка сохранения данных "+e);
            }

        }

    
}