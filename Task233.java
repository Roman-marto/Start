import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
public class Task233 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите длину массива");
        int size = scan.nextInt();
        out.println("Введите числа массива");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    index = j;
                    max = array[j];
                }
            }
            array[index] = array[i];
            array[i] = max;
        }
        out.println(Arrays.toString(array));
    }
}
