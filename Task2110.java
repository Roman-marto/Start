//Дан целочмсленный массив с количеством элементов n. Сжать массив, выбросив каждый второй элемент
//(выброшенные элементы заменить 0). Дополнительный массив не использовать
import java.util.Arrays;

public class Task2110 {
    public static void main (String[] args) {
        int[] a = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 15};
        int b = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++){
            if (i % 2 != 0) {
                a[i] = b;
            }
        }
        for (int i : a) {
            if (i != 0) {
                a[temp++] = i;
            }
        }
        for (int i = temp; i < a.length; i++) {
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));

    }
}
