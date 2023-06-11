//Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали

import java.util.Scanner;

public class Task222 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = n;
        int[][] arrays = new int[n][m];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == j) {
                    System.out.print(arrays[i][j] + " ");
                }
            }
        }
        int q = 0;
        int j = arrays.length - 1;
        int y = 0;
        while (q < arrays.length) {
            if (q == y) {
                System.out.print(arrays[q][j] + " ");
                y++;
                j--;
            }
            q++;
        }
    }
}
