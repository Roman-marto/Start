import java.util.Scanner;
import static java.lang.System.*;
public class Task2416 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите n");
        int n = scan.nextInt();
        out.println("Сумма чисел кратности n, состоящих из нечетных цифр = " + getRes(n));
        out.println("Количество четных цифр в сумме = " + getHonest(n));
    }
    private static int getNum(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
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
    private static boolean getInRow(int n) {
        boolean res = true;
        int last;
        while (n > 0) {
            last = n % 10;
            n /= 10;
            if (last % 2 == 0) {
                res = false;
            }
        }
        return res;
    }
    private static int getRes(int n) {
        int sum = 0;
        for (int i = getMin(n); i < getMax(n); i++) {
            if (getNum(i) == n && getInRow(i)) {
                sum += i;
            }
        }
        return sum;
    }
    private static int getHonest(int n) {
        int sum = getRes(n);
        int count = 0;
        while (sum > 0) {
            int b = sum % 10;
            sum /= 10;
            if (b % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
