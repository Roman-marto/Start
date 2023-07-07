import java.util.Scanner;
import static java.lang.System.*;
public class Task248 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        int[] array = new int[6];
        out.println("Введите значения массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        out.println(getResult(array, 1));
        out.println(getResult(array, 3));
        out.println(getResult(array, 4));
    }
    private static int getResult(int[] array, int a) {
        int sum = 0;
        int x = a - 1;
        for (int i = x; i <= x + 2; i++) {
            sum += array[i];
        }
        return sum;
    }
}
