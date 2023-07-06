import java.util.Arrays;
import java.util.Scanner;
public class Task2410 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scan.nextInt();
        System.out.println(Arrays.toString(getArr(n)));
    }
    public static int getSize(int a) {
        int count = 0;
        while (Math.abs(a) > 0) {
            a /= 10;
            count++;
        }
        return count;
    }
    public static int[] getArr(int a) {
        int[] array = new int[getSize(a)];
        a = Math.abs(a);
        int n = getSize(a) - 1;
        for (int i = 0; i < array.length; i++) {
            array[n] = a % 10;
            a /= 10;
            n--;
        }
        return array;
    }
}
