import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Task2413 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите n > 2");
        int n = scan.nextInt();
        out.println(Arrays.toString(getTwins(n)));
    }
    private static int getSimple(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
    private static int getCountSimpleInRow(int n) {
        int count = 0;
        for (int i = n; i <= 2 * n; i++) {
            if (getSimple(i) == 0) {
                count++;
            }
        }
        return count;
    }
    private static int[] getSimpleArr(int n) {
        int[] array = new int[getCountSimpleInRow(n)];
        int q = 0;
        for (int i = n; i <= 2 * n; i++) {
            if (getSimple(i) == 0) {
                array[q] = i;
                q++;
            }
        }
        return array;
    }
    private static int[] getTwins(int n) {
        int[] arr;
        arr = getSimpleArr(n);
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] == -2) {
                count++;
            }
        }
        int[] res = new int[count * 2];
        int t = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] == -2) {
                res[t] = arr[i];
                res[t + 1] = arr[i + 1];
                t += 2;
            }
        }
        return res;
    }
}
