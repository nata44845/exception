package Task5;
/* Массив 4*4 */
public class Main5 {
    public static void main(String[] args) {
        String[][] array = new String[][] {{"1","2","3","4"},{"5","6","7","8"},
        {"9","10","11","12"}, {"","10","11","12"}};
        try {
            System.out.println(getSum(array,4));
        } catch (MyArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getSum(String[][] array, int length) {
        int sum = 0;
        if (array.length != length) {
            throw new MyArraySizeException(length);
        }
        
        for (int i=0; i<array.length; i++) {
            if (array[i].length != length) {
                throw new MyArraySizeException(length);
            }
            for (int j=0; j<array[i].length; j++) {
                try {
                    sum +=Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(String.format("%d %d",i,j));
                }
                   

            }
        } 
        return sum;
    }
}
