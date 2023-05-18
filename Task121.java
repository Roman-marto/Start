public class Task121 {
    public static void main (String[] args) {
        double corner1 = 46.3;
        double corner2 = 450;
        double corner3 = 180 - corner1 - corner2;
        if (corner3 > 0 && corner3 == 90) {
            System.out.println("Существует, прямоугольный");
        }
        else if (corner3 > 0 && corner3 != 0) {
            System.out.println("Существует");
        }
        else {
            System.out.println("Не существует");
        }
    }
}
