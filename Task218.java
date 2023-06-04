//Дана последовательность целых чисел а1, а2, а3 ... аn. Сформировать новую последовательность, выбросив
// из исходной те члены, которые равны min(а1, а2, а3 ... аn).

import java.util.Arrays;

public class Task218 {
    public static void main (String[] args) {
        int[] a = new int[] {1, -1, 2, 3, 4, 1, 5};
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                count += 1;
            }
        }
        int[] b = new int[a.length - count];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != min) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
     }
}
