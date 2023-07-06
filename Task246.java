import java.util.Scanner;
import static java.lang.System.*;
public class Task246 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите число а");
        int a = scan.nextInt();
        out.println("Введите число b");
        int b = scan.nextInt();
        out.println("Введите число c");
        int c = scan.nextInt();
        if (a == b && a == c){
            out.println("Все числа равны. Введите разные числа");
        }
        else if (a == 0 || b == 0 || c == 0){
            out.println("Одно из чисел равно 0. Введите числа, отличные от 0");
        }
        else {
            out.println(getSimple(a, b, c));
        }
    }
    public static String getSimple(int a, int b, int c) {
        int q = Math.min(a, b);
        q = Math.min(q, c);
        int nod;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= q; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                nod = i;
                if (nod > max) {
                    max = nod;
                }
            }
        }
        String negative = "Взаимно простые числа";
        String positive = "НЕ взаимно простые числа";
        if (max == 1) {
            return negative;
        }
        else {
            return positive;
        }
    }
}
