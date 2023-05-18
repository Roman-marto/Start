public class Task123 {
    public static void main (String[] args) {
        double x1 = 1;
        double x2 = 2;
        double x3 = 3;
        double y1 = 4;
        double y2 = 2;
        double y3 = 6;
        if (((x3 - x1) / (x2 - x1)) == ((y3-y1) / (y2 - y1))) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
