public class Task114 {
    public static void main (String[] args) {
        double x = 111.222;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}
