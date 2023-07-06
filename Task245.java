import java.util.Scanner;
import static java.lang.System.*;
public class Task245 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите длину массива");
        int size = scan.nextInt();
        out.println("Введите числа массива");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        out.println("Второе по величине число = " + getSecond(array));
    }
    public static int getSecond(int[] array) {
        int first = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > first) {
                first = j;
            }
        }
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > second && array[i] < first) {
                second = array[i];
            }
        }
        return second;
    }
}
