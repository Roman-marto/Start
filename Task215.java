//Дана последовательность целых чисел. вывести на печать только те числа, для которых a[i] > i
public class Task215 {
    public static void main (String[] args) {
        int[] a = new int[] {0, 1, 2, 3, 5, 6, 7, 4};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > i) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
