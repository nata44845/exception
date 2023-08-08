package Task2;

public class task2 {
    public static void main(String[] args) {
        int intArray[] = new int[] {3,4,5,6,7,5,6,8,6}; 
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (NullPointerException e) {
            System.out.println("Массив не инициализирован");
         } catch (IndexOutOfBoundsException e) {
            System.out.println("Индекс вне массива");
         } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
         } catch (Exception e) {
            System.out.println(e);
         }

    }
}
