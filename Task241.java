import java.util.Scanner;
import static java.lang.System.*;
public class Task241 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите число а");
        int a = scan.nextInt();
        out.println("Введите число b");
        int b = scan.nextInt();
        if (a == b){
            out.println("a и b равны. Введите разные a и b");
        }
        else if (a == 0 || b == 0){
            out.println("a или b равны 0. Введите a и b, отличные от 0");
        }
        else {
            out.println("НОД = " + getNod(a, b));
            out.println("НОК = " + getNok(a, b));
        }
    }
    public static int getNod(int a, int b) {
        int c = 0;
        if (a < b) {
            c = a;
        }
        else {
            c = b;
        }
        int nod = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
                if (nod > max) {
                    max = nod;
                }
            }
        }
            return max;
    }
    public static int getNok(int a, int b) {
        int nok = a * b / getNod(a, b);
        return nok;
    }
}
