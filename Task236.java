import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Task236 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите длину массива");
        int n = scan.nextInt();
        int[] arr = new int[n];
        out.println("Введите значения массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int gap = arr.length / 2;
        int temp = 0;
        while (gap >= 1) {
            for (int right = 0; right < arr.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (arr[c] > arr[c + gap]) {
                        temp = arr[c];
                        arr[c] = arr[c + gap];
                        arr[c + gap] = temp;
                    }
                }
            }
            gap = gap / 2;
        }
        out.println(Arrays.toString(arr));
    }
}
