import java.io.FileWriter;
import java.io.IOException;

public class SaveService {
    String fileName;

    public SaveService(String fileName) {
        this.fileName = fileName;
    }

    public void saveData(String data) throws IOException {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(data);
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}