import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class SaveService {

    public void saveData(Map<String, String> map, String path) throws IOException {
        try (FileWriter writer = new FileWriter(path, true)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.write(entry.toString());
                writer.write("\n");
                writer.flush();
            }
        }
        catch (IOException e) {
            throw new IOException(e);
        }
    }
}