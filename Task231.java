import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Task231 {
    public static void main (String[] args) {
        Scanner scan = new Scanner (in);
        out.println("Введите размер 1 массива");
        int size1 = scan.nextInt();
        out.println("Введите числа 1 массива");
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scan.nextInt();
        }
        out.println("Введите размер 2 массива");
        int size2 = scan.nextInt();
        out.println("Введите числа 2 массива");
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scan.nextInt();
        }
        out.println("Введите значение, после которого объединить массивы");
        int k = scan.nextInt();
        int[] res = new int[array1.length + array2.length];
        if (k > size1) {
            out.println("Некорректно введено число для объединения массивов");
        }
        else {
            arraycopy(array1, 0, res, 0, k);
            arraycopy(array2, 0, res, k, array2.length);
            arraycopy(array1, k, res, k + array1.length, array1.length - k);
        }
        out.println(Arrays.toString(array1));
        out.println(Arrays.toString(array2));
        out.println(Arrays.toString(res));
    }
}
