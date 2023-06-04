//Дана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются простыми.
public class Task216 {
    public static void main (String[] args) {
        double[] a = new double[] {-1.0, 2.0, -3.0, 4.0, -5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(i) == true) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int num) {
        boolean b = false;
        if (num == 2) {
            b = true;
        }
        else if (num < 2) {
            b = false;
        }
        else {
            for (int i = 3; i <= num / 2; i++) {
                if (num % i == 0) {
                    b = false;
                }
                else {
                    b = true;
                }
            }
        }
        return b;
    }
}
