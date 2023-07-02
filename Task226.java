import java.util.Arrays;
import java.util.Scanner;

public class Task226 {
    public static void main (String[] args) {
       Scanner scan = new Scanner (System.in);
       int n = scan.nextInt();
        int[][] array = new int[n][n];
       int min = 0;
       int max = n;
       if (n % 2 != 0) {
           System.out.println("Некорректно введено n");
       }
       else {
           for (int i = 0; i < array.length / 2; i++) {
               min++;
               max--;
               for (int j = min - 1; j < max + 1; j++) {
                   array[i][j] = 1;
               }
           }
           for (int i = array.length / 2; i < array.length; i++) {
               min--;
               max++;
               for (int j = min; j < max; j++) {
                   array[i][j] = 1;
               }
           }
           System.out.println(Arrays.deepToString(array).replace("],", "]\n"));
       }
    }
}
