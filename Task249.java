import java.util.Scanner;
import static java.lang.System.*;
public class Task249 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите X");
        int X = scan.nextInt();
        out.println("Введите Y");
        int Y = scan.nextInt();
        out.println("Введите Z");
        int Z = scan.nextInt();
        out.println("Введите T");
        int T = scan.nextInt();
        out.println(getSquare(X, Y, Z, T));
    }

    private static double getSquare(int x, int y, int z, int t) {
        double S1 = (double) (x * y) / 2;
        double g = Math.sqrt(x * x + y * y);
        double p = (z + t + g) / 2;
        double S2 = Math.sqrt(p * (p - g) * (p - z) * (p - t));
        return S1 + S2;
    }
}
