package Task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class SaveService {

    public void save() throws SavedException {
        System.out.println("save document started...");
        try (FileWriter writer = new FileWriter("test2")) {
            throw new IOException("Operation failed");
        } catch (IOException e) {
        //     throw new RuntimeException(e);
        //     e.printStackTrace();
            System.out.println(e.getMessage());
            throw new SavedException("Saved documents failed",new Date(),e);
        }
    }

}
