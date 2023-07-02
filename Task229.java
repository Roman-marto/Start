import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Task229 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите число строк");
        int n = scan.nextInt();
        out.println("Введите число столбцов");
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        int[] res = new int[m];
        int q = 0;
        int max = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        out.println("Исходная матрица");
        out.println(Arrays.deepToString(array).replace("],", "]\n"));
        for (int i = 0; i < array[0].length; i++) {
            sum = 0;
            for (int[] ints : array) {
                sum += ints[i];
                if (sum > max) {
                    max = sum;
                    q = i;
                }
            }
            res[i] = sum;
        }
        out.println("Сумма чисел каждого столбца = " + Arrays.toString(res));
        out.println("Максимальная сумма = " + max + " в " + (q + 1) + " столбце.");
    }
}
