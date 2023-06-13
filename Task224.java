/**Сформировать квадратнцю матрицу n (четное) порядка по образцу
1 2 3       n
n n-1 n-2   1
1 2 3       n
n n-1 n-2   1
**/

import java.util.Arrays;
import java.util.Scanner;

public class Task224 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = 0;
        int[][] array = new int[n][n];
        int max = array.length + 1;
        if (n % 2 != 0) {
            System.out.println("Некорректно введено n");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array.length > min) {
                            array[i][j] = min + 1;
                            min++;
                            System.out.print(array[i][j] + " ");
                        }
                    }
                    min = 0;
                    System.out.println();
                }
                else {
                    for (int j = 0; j < array[i].length; j++) {
                        if (max > 0) {
                            array[i][j] = max - 1;
                            max--;
                            System.out.print(array[i][j] + " ");
                        }
                    }
                    max = array.length + 1;
                    System.out.println();
                }
            }
        }
    }
}
