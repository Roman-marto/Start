import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Task2414 {
    public static void main (String[] args){
        Scanner scan = new Scanner(in);
        out.println("Введите k");
        int k = scan.nextInt();
        out.println(Arrays.toString(getArr(k)));
    }
    private static int getNum(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
    private static int getSum(int n) {
        int sum = 0;
        int t;
        int q = getNum(n);
        while (Math.abs(n) > 0) {
            int b = n % 10;
            t =(int) Math.pow(b, q);
            n /= 10;
            sum += t;
        }
        return sum;
    }
    private static int getCount(int k) {
        int count = 0;
        for (int i = 0; i <= k; i++) {
            if (getSum(i) == i) {
                count++;
            }
        }
        return count;
    }
    private static int[] getArr(int k) {
        int[] arr = new int[getCount(k)];
        int a = 0;
        for (int i = 0; i <= k; i++) {
            if (getSum(i) == i) {
                arr[a] = i;
                a++;
            }
        }
        return arr;
    }
}
