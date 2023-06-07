//Дан массив целых чисел. Определить самое часто встречаемое число. Если таких чисел несколько, вывести меньшее.

public class Task219 {
    public static void main (String[] args) {
        int[] a = new int[]{2, 2, 3, 4, 5, 2, 3, 0, 0, 0, 3, 2, -1, -1, -1, -1};
        int temp = 0;
        int count = 0;
        int countmax = 1;
        int nummax = a[0];
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    isSort = false;
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > countmax) {
                countmax = count;
                nummax = a[i];
            }
        }
        System.out.println(nummax);
    }
}
