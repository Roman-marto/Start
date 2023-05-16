public class Task112 {
    public static void main (String[] args){
        int a = 1;
        int b = 2;
        int c = 1;
        double answer;
        double firstAction = (b + Math.sqrt(b*b + 4 * a * c)) / 2 * a;
        answer =  firstAction - Math.pow(a,3) * c + Math.pow(b,-2);
        System.out.println(answer);
    }



}

