import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Task244 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите число точек");
        int n = scan.nextInt();
        out.println("Введите координаты точек в формате x, y");
        int[] array = new int[n * 2];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        out.println(Arrays.toString(array));
        out.println(Arrays.toString(getDistance(array)));
    }
    private static int[] getDistance(int[] array) {
        double res;
        double max = Integer.MIN_VALUE;
        int[] arr = new int[4];
        for (int i = 0; i < array.length; i = i + 2) {
            for (int j = i + 2; j < array.length; j = j + 2) {
                res = Math.sqrt(Math.pow((array[j] - array[i]), 2) + Math.pow((array[j + 1] - array[i + 1]), 2));
                if (res > max) {
                    max = res;
                    arr[0] = array[i];
                    arr[1] = array[i + 1];
                    arr[2] = array[j];
                    arr[3] = array[j + 1];
                }
            }
        }
        return arr;
    }
}
