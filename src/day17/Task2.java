package day17;

public class Task2 {
    public static void main(String[] args) {
        // Task: 0'dan 20'ye kadar olan tek sayıların toplamını bulup, sonucu ekrana yazdıran Java programını yazın.
        int sum=0;
        for (int i = 1; i < 20; i+=2) {
            sum+=i;
        }
        System.out.println("0'dan 20'ye kadar olan tek sayıların toplamı = "+sum);
    }
}
