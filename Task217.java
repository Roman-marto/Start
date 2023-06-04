//Даны действительные числа а1, а2 ...аn. Найти max(a1+a2n, a2+a2n-1....an+an+1)
public class Task217 {
    public static void main (String[] args) {
        int[] a = new int[] {5, 10, 3, 100, -2, -8};
        if (a.length % 2 != 0) {
            System.out.println("Некорректно введено количество символов массива");
        }
        System.out.println(getSum(a));
    }
    public static int getSum(int[] array) {
        int sum = 0;
        int x = 1;
        for (int i = 0; i < array.length / 2; i++, x++) {
                if (array[i] + array[array.length - x] > sum) {
                    sum = array[i] + array[array.length - x];
                }
            }
        return sum;
    }
}
