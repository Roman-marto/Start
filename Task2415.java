import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
public class Task2415 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите n");
        int n = scan.nextInt();
        out.println(Arrays.toString(getCount(n)));
    }

    private static int getNum(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    private static boolean getInRow(int n) {
        boolean res = true;
        int last = n % 10;
        n /= 10;
        while (n > 0) {
            if (last - n % 10 != 1) {
                res = false;
            }
            last = n % 10;
            n /= 10;
        }
        return res;
    }

    private static int getMin(int n) {
        int min = 1;
        if (n == 1) {
            min = 1;
        }
        else if (n == 2) {
            min *= 10;
        }
        else if (n == 3) {
            min *= 100;
        }
        else if (n == 4) {
            min *= 1000;
        }
        else if (n == 5) {
            min *= 10000;
        }
        else if (n == 6) {
            min *= 100000;
        }
        else if (n == 7) {
            min *= 1000000;
        }
        else if (n == 8) {
            min *= 10000000;
        }
        else if (n == 9) {
            min *= 100000000;
        }
        else {
            min *= 1000000000;
        }
        return min;
    }
    private static int getMax(int n) {
        int max = 10;
        if (n == 1) {
            max = 10;
        }
        else if (n == 2) {
            max *= 100;
        }
        else if (n == 3) {
            max *= 1000;
        }
        else if (n == 4) {
            max *= 10000;
        }
        else if (n == 5) {
            max *= 100000;
        }
        else if (n == 6) {
            max *= 1000000;
        }
        else if (n == 7) {
            max *= 10000000;
        }
        else if (n == 8) {
            max *= 100000000;
        }
        else if (n == 9) {
            max *= 1000000000;
        }
        else {
            max = Integer.MAX_VALUE;
        }
        return max;
    }
    private static int[] getCount(int n) {
        int count = 0;
        for (int i = getMin(n); i < getMax(n); i++) {
            if (getNum(i) == n && getInRow(i)) {
                count++;
            }
        }
        int[] arr = new int[count];
        int q = 0;
        for (int i = getMin(n); i < getMax(n); i++) {
            if (getNum(i) == n && getInRow(i)) {
                arr[q] = i;
                q++;
            }
        }
        return arr;
    }
}
