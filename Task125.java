public class Task125 {
    public static void main (String[] args) {
        double x = 4;
        double result;
        if (x <= 3) {
            result = x * x + -3 * x + 9;
            System.out.println(result);
        }
        else {
            result = 1 / (x * x *x + 6);
            System.out.println(result);
        }
    }
}
