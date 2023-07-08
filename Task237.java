import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
public class Task237 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите длину 1 массива");
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        out.println("Введите значения 1 массива");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        out.println("Введите длину 2 массива");
        int m = scan.nextInt();
        int[] arr2 = new int[m];
        out.println("Введите значения 2 массива");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        int[] res = new int[n + m];
        arraycopy(arr1, 0, res, 0, n);
        arraycopy(arr2, 0, res, n, m);
        Arrays.sort(res);
        int q = 0;
        int[] array = new int[m];
        while (q < m) {
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (res[i] == arr2[j]) {
                        array[q] = i;
                        q++;
                    }
                }
            }
        }
        out.println(Arrays.toString(res));
        out.println(Arrays.toString(array));
    }
}
