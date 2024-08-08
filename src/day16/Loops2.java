package day16;

public class Loops2 {
    public static void main(String[] args) {
        //TODO: 1'den 10'a kadar olan sayıların ortalamasını bulan Java programını yazın.

        double sum=0.0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum/10);
    }
}
