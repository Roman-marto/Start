//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
import java.util.Scanner;


public class Task138 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = "";
        String result2 = "";
        String resultLine = "";
        while (Math.abs(a) > 0) {
            result = result + (a % 10);
            a = a / 10;
        }
        while (Math.abs(b) > 0) {
            result2 = result2 + (b % 10);
            b = b / 10;
        }
        for (int i = 0; i < result.length(); i++) {
            for (int j = 0; j < result2.length(); j++) {
                if (result.charAt(i) == result2.charAt(j)) {
                    resultLine += result.charAt(i) + " ";
                }
            }
        }
        System.out.println(resultLine);
    }
}


