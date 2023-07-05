import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
public class Task234 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите длину массива");
        int size = scan.nextInt();
        out.println("Введите числа массива");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        boolean flag = false;
        int temp = 0;
        int count = 0;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    flag = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        }
        out.println(Arrays.toString(array));
        out.println("Число перестановок = " + count);
    }
}
