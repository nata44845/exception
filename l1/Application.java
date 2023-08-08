import java.io.File;

/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        // System.out.println(getFileSize(new File("123")));
        //System.out.println(divide(10, 0));
        //a();
        int x = Integer.parseInt("A");
    }

    public static int divide(int a1, int a2) {
        if (a2 ==0 ) throw new RuntimeException("Нельзя делить на 0");
        return a1/a2;
    }

    public static long getFileSize(File file) {
        if (!file.exists()) return -1L;
        return file.length();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] ints = new int[10];
        System.out.println(ints[1000]);
    }
}