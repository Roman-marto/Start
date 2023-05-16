public class Task113 {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        double result;
        result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println(result);

    }
}
