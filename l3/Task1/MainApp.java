package Task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * MainApp
 */
public class MainApp {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("test");
                FileWriter writer = new FileWriter("test1");
                //String test = "test"
                ) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }


}