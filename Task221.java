//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
import java.util.Scanner;

public class Task221 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arrays = new int[n][m];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++)
                arrays[i][j] = scan.nextInt();
        }
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j += 2) {
                if (arrays[0][j] > arrays[arrays[i].length - 1][j]) {
                    System.out.print(arrays[i][j] + " ");
                }
            }
        }
    }
}
