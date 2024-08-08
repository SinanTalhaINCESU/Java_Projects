package day16;

public class Loops {
    public static void main(String[] args) {
        //TODO: Kendi isminizi 10 kez yazdıran Java programını yazınız.

        for (int i = 0; i < 10; i++) {
            System.out.println("Sinan");
        }

        //TODO: 1'den 10'a kadar olan sayıların toplamını bulan Java programını yazın.

        int toplam=0;
        for (int i = 0; i < 11; i++) {
            toplam += i;
        }
        System.out.println(toplam);
    }
}
