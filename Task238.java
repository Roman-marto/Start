import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
public class Task238 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите количество дробей");
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        out.println("Введите числители");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        int[] arr2 = new int[n];
        out.println("Введите знаменатели");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        int max = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        int k = 2;
        for (int i = 0; i < arr2.length; i++) {
            if (max % arr2[i] != 0) {
                max = max * k;
                k++;
                i = 0;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] * (max / arr2[i]);
            arr2[i] = max;
        }
        Arrays.sort(arr1);
        out.println(Arrays.toString(arr1));
        out.println(Arrays.toString(arr2));
    }
}
