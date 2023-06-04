//В массив а(n) занесены натуральные числа. Найти сумму тех элементов, которые кратны k.
public class Task211 {
    public static void main (String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 2;
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                result = result + a[i];
            }
        }
        System.out.println(result);
    }
}
