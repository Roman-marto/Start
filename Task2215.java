import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Task2215 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (in);
        out.println("Введите число строк");
        int m = scan.nextInt();
        out.println("Введите число столбцов");
        int n = scan.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 5 - (int)(Math.random() * 10);
            }
        }
        out.println("Исходная матрица");
        out.println(Arrays.deepToString(array).replace("],", "]\n"));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        out.println("Наибольшее число " + max);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }
        out.println("Конечная матрица");
        out.println(Arrays.deepToString(array).replace("],", "]\n"));
    }
}
