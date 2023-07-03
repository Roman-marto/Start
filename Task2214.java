import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Task2214 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (in);
        out.println("Введите число строк");
        int m = scan.nextInt();
        out.println("Введите число столбцов");
        int n = scan.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
                if (i <= j && i < array[i].length) {
                    for (int k = i; k >= 0; k--) {
                        array[i][j] = 1;
                    }
                }
            }
        }
        out.println(Arrays.deepToString(array).replace("],", "]\n"));
    }
}
