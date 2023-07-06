import java.util.Scanner;
import static java.lang.System.*;
public class Task242 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите число а");
        int a = scan.nextInt();
        out.println("Введите число b");
        int b = scan.nextInt();
        out.println("Введите число c");
        int c = scan.nextInt();
        out.println("Введите число d");
        int d = scan.nextInt();
        if (a == b && a == c && a == d){
            out.println("Все числа равны. Введите разные числа");
        }
        else if (a == 0 || b == 0 || c == 0 || d == 0){
            out.println("Одно из чисел равно 0. Введите числа, отличные от 0");
        }
        else {
            out.println("НОД = " + getNod(a, b, c, d));
        }
    }
    public static int getNod(int a, int b, int c, int d) {
        int q = 0;
        if (a < b) {
            q = a;
        }
        else {
            q = b;
        }
        if (q > c) {
            q = c;
        }
        if (q > d) {
            q = d;
        }
        int nod = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= q; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                nod = i;
                if (nod > max) {
                    max = nod;
                }
            }
        }
            return max;
    }
}

