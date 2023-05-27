public class Task132 {
    public static void main (String[] args) {
        int a = -10;
        int b = 10;
        int h = 1;
        int y;
        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("x= " + x + "; y= " + y);
        }
    }
}
