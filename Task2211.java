import java.util.Arrays;
import static java.lang.System.*;
public class Task2211 {
    public static void main (String[] args) {
        int[][] array = new int[10][20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 15);
            }
        }
        out.println(Arrays.deepToString(array).replace("],", "]\n"));
        int count;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                out.println("встречается в строке " + (i + 1));
            }
        }
    }
}
