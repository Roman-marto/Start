import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Task2210 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите размерность матрицы");
        int n = scan.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 50 - ((int) (Math.random() * 100));
            }
        }
        out.println("Исходная матрица");
        out.println(Arrays.deepToString(array).replace("],", "]\n"));
        out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j && array[i][j] > 0) {
                    out.print(array[i][j] + " ");
                }
            }
        }
    }
}
