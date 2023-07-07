import java.util.Scanner;
import static java.lang.System.*;
public class Task2417 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите n");
        int n = scan.nextInt();
        out.println(getRes(n));
    }
    private static int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int b = n % 10;
            n /= 10;
            sum += b;
        }
        return sum;
    }
    private static int getRes(int n) {
        int count = 0;
        while (n > 0) {
            n -= getSum(n);
            count++;
        }
        return count;
    }
}
