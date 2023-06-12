//Дана матрица. Вывести на экран k-ю строку и p-столбец
import java.util.Scanner;

public class Task223 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = scan.nextInt();
            }
        }
        int k = 5;
        if (k > m) {
            System.out.println("Некорректный номер строки");
        }
        else {
            System.out.println("k строка = ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++){
                    if ((i + 1) == k) {
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
        }
        int p = 5;
        if (p > n) {
            System.out.println();
            System.out.println("Некорректный номер столбца");
        }
        else {
            System.out.println();
            System.out.println("p столбец = ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++){
                    if ((j + 1) == p) {
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
        }
    }
}
