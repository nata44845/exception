package Task3;

import java.io.IOException;

public class Main3 {

    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
            System.out.println(counter.getCount());
            System.out.println(counter.isClosed());
            counter.add();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
