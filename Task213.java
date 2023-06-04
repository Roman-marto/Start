//Дан массив действительных чисел размерностью N. Посчитать сколько в нем отрицательных, положительных и нулевых элементов
public class Task213 {
    public static void main (String[] args){
        int[] a = new int[] {-3, -2, 2, 0, 1, -1, 0};
        int positive = 0;
        int negative = 0;
        int nul = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positive += 1;
            }
            else if (a[i] < 0) {
                negative += 1;
            }
            else {
                nul += 1;
            }
        }
        System.out.print("Положительных = " + positive + ", отрицательных = " + negative + ", нулевых = " + nul);
    }
}
