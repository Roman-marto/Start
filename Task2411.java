import java.util.Scanner;
import static java.lang.System.*;
public class Task2411 {
    public static void main (String[] args){
        Scanner scan = new Scanner(in);
        out.println("Введите 1-е число ");
        int a = scan.nextInt();
        out.println("Введите 2-е число ");
        int b = scan.nextInt();
        out.println(getNumber(a, b));
    }
    public static int getSize(int a) {
        int count = 0;
        while (Math.abs(a) > 0) {
            a /= 10;
            count++;
        }
        return count;
    }
    public static String getNumber (int a, int b) {
        String res;
        if (getSize(a) > getSize(b)) {
            res = "Больше цифр в 1-ом числе";
        }
        else if (getSize(a) < getSize(b)){
            res = "Больше цифр во 2-ом числе";
        }
        else {
            res = "Числа равны";
        }
        return res;
    }
}
