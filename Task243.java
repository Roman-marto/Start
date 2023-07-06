import java.util.Scanner;
import static java.lang.System.*;
public class Task243 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите длину стороны");
        int a = scan.nextInt();
        double S = 6 * getSquare(a);
        out.println("Площадь правильного шестиугольника со стороной " + a + " равна " + S);
    }
    public static double getSquare(int a) {
        return Math.sqrt(3) / 4 * Math.pow(a, 2);
    }
}
