public class Task116 {
    public static void main (String[] args) {
        double x = 3;
        double y = 3.1;
        if ((x <= 3 && x >= -3 && y >= -3 && y <= 3) || (x <= 2 && x >= -2 && y >= 0 && y <= 4)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
