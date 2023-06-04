import java.util.Arrays;

//Дана последовательность чисел. Заменить все ее члены, большие данного Z, этим числом. подсчитать количество замен
public class Task212 {
    public static void main (String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int z = 8;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                count++;
            }
        }
        System.out.println("Новая последовательность равна = " + Arrays.toString(a) + "; количество замен = " + count);
    }
}
