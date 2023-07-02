import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Task225 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (in);
        int n = scan.nextInt();
        int m = n;
        int[][] array = new int[n][m];
        int count = 0;
        if (n % 2 != 0) {
            out.println("Некорректно введено n");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                count++;
                m--;
                for (int j = 0; j < m + 1; j++) {
                    array[i][j] = count;
                }
            }
            out.println(Arrays.deepToString(array).replace("],", "]\n"));
        }
    }
}
