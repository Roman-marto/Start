import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Task2412 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите число K");
        int K = scan.nextInt();
        out.println("Введите число N");
        int N = scan.nextInt();
        out.println(Arrays.toString(getArr(K, N)));
    }
    private static int getSum(int a) {
        int sum = 0;
        while (Math.abs(a) > 0) {
            int b = a % 10;
            a /= 10;
            sum += b;
        }
        return sum;
    }
    private static int getCount(int K, int N) {
        int count = 0;
        for (int i = 0; i <= N; i++) {
            if (getSum(i) == K) {
                count++;
            }
        }
        return count;
    }
    private static int[] getArr(int K, int N) {
        int n = 0;
        int[] arr = new int[getCount(K, N)];
        for (int i = 0; i <= N; i++) {
            if (getSum(i) == K) {
                arr[n] = i;
                n++;
            }
        }
        return arr;
    }
}
