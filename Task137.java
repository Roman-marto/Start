import java.util.Scanner;

public class Task137 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int bigger = 0;
        int lower = 0;
        if (m > n) {
            bigger = m;
            lower = n;
        }
        else {
            lower = m;
            bigger = n;
        }
        for (int i = lower; i <= bigger; i++) {
            System.out.print(getNumbers(i));
        }
    }
    public static String getNumbers(int num) {
        String result = "";
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                result = result + " " + i;
            }
        }
        return result;
    }
}

