public class Task115 {
    public static void main (String [] args){
        int t = 12345;
        int hours = t / 3600;
        int minutes = t / 60 - hours * 60;
        int sec = t - minutes * 60 - hours * 3600;
        System.out.println(hours + "ч " + minutes + "мин " + sec + "с");

    }
}
