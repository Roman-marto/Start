import java.util.Arrays;

//Дан ряд действительных чисел. Поменять местами наибольший и наименьший элемент
public class Task214 {
    public static void main (String[] args) {
        int[] a = new int[]{-5, 3, 5, -100, 30};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        int average = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < max) {
                max = a[i];
                indexMin = i;
            }
            if (a[i] > min) {
                min = a[i];
                indexMax = i;
            }
        }
        average = a[indexMax];
        a[indexMax] = a[indexMin];
        a[indexMin] = average;
        System.out.println(Arrays.toString(a));
    }
}
