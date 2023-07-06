public class Task247 {
    public static void main (String[] args) {
        int sum = 0;
        for (int i = 1; i <= 9; i += 2) {
            sum = sum + getFact(i);
        }
        System.out.println(sum);
    }
    public static int getFact(int a) {
        int sum = 0;
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
            sum = res;
        }
        return sum;
    }
}
