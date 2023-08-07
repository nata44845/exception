import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        // Object object = new String("123");
        // File file = (File)object;
        // System.out.println(file);

        // String name = null;
        // System.out.println(name.length());

        // List<Object> emptyList = Collections.emptyList();
        // emptyList.add(new Object());

        // try {
        //     String name = null;
        //     System.out.println(name.length());
        //     int a = 0;
        //     int b = 10/a;
            
        //     System.out.println("Это сообщение не будет выведено в консоль");

        // } catch (ArithmeticException e) {
        //     System.out.println("Деление на ноль");
        // } catch (NullPointerException e) {
        //     System.out.println("Строка не задана");
        // }

        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getClass().getSimpleName());
        } finally {
            System.out.println("finally start");
            if (test != null) 
            try {
                test.close();
                
            } catch (IOException e) {
                System.out.println(e.getClass().getSimpleName());
            }
            System.out.println("finally stop");
        }

        // try {
        //     createReport();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // } finally {
        //     //Сделать обязательно
        // }
    }

    public static void createReport() throws IOException {
        PrintWriter writer = new PrintWriter("report.txt");
        writer.close();
    }
}