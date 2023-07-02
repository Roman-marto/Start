import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class Task228 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (in);
        out.println("Введите количество строк");
        int n = scan.nextInt();
        out.println("Введите количество столбцов");
        int m = scan.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        out.println("Исходная матрица");
        out.println(Arrays.deepToString(array).replace("],", "]\n"));
        out.println("Введите номера столбцов для замены");
        int num1 = scan.nextInt() - 1;
        int num2 = scan.nextInt() - 1;
        int temp = 0;
        if (num1 > m || num2 > m || num1 == num2 || num1 < 0 || num2 < 0) {
            out.println("Некорректно введены номера столбцов для замены");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    temp = array[i][num1];
                    array[i][num1] = array[i][num2];
                    array[i][num2] = temp;
                }
            }
            out.println("Преобразованная матрица");
            out.println(Arrays.deepToString(array).replace("],", "]\n"));
        }
    }
}
