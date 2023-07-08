import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
public class Task235 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(in);
        out.println("Введите длину массива");
        int n = scan.nextInt();
        int[] arr = new int[n];
        out.println("Введите значения массива");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        insertionSort(arr, n);
        out.println(Arrays.toString(arr));
    }
    static int binarySearch(int a[], int item, int low, int high)
    {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (item == a[mid])
                return mid + 1;
            else if (item > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
    static void insertionSort(int a[], int n)
    {
        int i, loc, j, selected;

        for (i = 1; i < n; ++i) {
            j = i - 1;
            selected = a[i];

            loc = binarySearch(a, selected, 0, j);
            while (j >= loc) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = selected;
        }
    }
}
