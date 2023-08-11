package Task3;

public class Task3 {
    /*
    Обработайте возможные исключительные ситуации
    “Битые” значения в исходном массиве считайте нулями
    Можно внести в код правки, которые считаете необходимыми.
     */
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"111", "222"}, {"124", "Пока"}};
        System.out.println(ex2(arr));
    }

    public static int ex2(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String item = arr[i][j];
//                if (item.matches("[0-9]+")){
                if (checkText(item)){
                    int val = Integer.parseInt(item);
                    sum += val;
                }
            }
        }
        return sum;
    }

    private static boolean checkText(String text){
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < '0' || text.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

}
