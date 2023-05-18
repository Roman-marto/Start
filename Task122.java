public class Task122 {
    public static void main (String[] args) {
        double a = -100;
        double b = -101;
        double c = 120;
        double d = 0;
        double result1;
        double result2;
        double max;
        if (a > b) {
            result1 = b;
        }
        else if (a < b) {
            result1 = a;
        }
        else {
            result1 = a;
        }
        if (c > d) {
            result2 = d;
        }
        else if (c < b) {
            result2 = c;
        }
        else {
            result2 = c;
        }
        if (result1 > result2) {
            System.out.println(result1);
        }
        else if (result1 < result2) {
            System.out.println(result2);
        }
        else {
            System.out.println(result1);
        }
    }
}
