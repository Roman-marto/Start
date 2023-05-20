import java.util.Scanner;

public class Task131 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result + i;
        }
        System.out.println("Результат сложения равен " + result);
    }
}
