public class Task135 {
    public static void main (String[] args) {
        int n = 10;
        double e = 2;
        double sum = 0;
        for (int i = -10; i <= n; i++) {
            double a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3,i)));
            if ((Math.abs(a) >= e)) {
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
}
