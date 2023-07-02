import java.util.Arrays;
import java.util.Scanner;

public class Task227 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[][] array = new double[n][n];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (Math.pow(i, 2) - Math.pow(j, 2)) / n;
                if (array[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println(Arrays.deepToString(array).replace("],", "]\n"));
        System.out.println(count);
    }
}
