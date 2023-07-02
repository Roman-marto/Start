import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Task2212 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите число строк");
        int n = scan.nextInt();
        out.println("Введите число столбцов");
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 5 - ((int)(Math.random() * 10));
            }
        }
        out.println("Исходная матрица");
        out.println(Arrays.deepToString(array).replace("],", "]\n"));
        out.println("Сортировка по возрастанию");
        out.println(Arrays.deepToString(getIncrease(array)).replace("],", "]\n"));
        out.println("Сортировка по убыванию");
        out.println(Arrays.deepToString(getDecrease(array)).replace("],", "]\n"));

    }
    public static int[][] getIncrease(int[][] a) {
        int len = a.length;
        for(int k = 0; k < len; k++) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < a[i].length - 1; j++) {
                    if (a[i][j] > a[i][j + 1]) {
                        int temp = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = temp;
                    }
                }
            }
        }
        return a;
    }
    public static int[][] getDecrease(int[][] a) {
        int len = a.length;
        for(int k = 0; k < len; k++) {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < a[i].length - 1; j++) {
                    if (a[i][j] < a[i][j + 1]) {
                        int temp = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = temp;
                    }
                }
            }
        }
        return a;
    }
}
