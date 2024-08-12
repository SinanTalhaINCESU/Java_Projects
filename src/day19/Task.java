package day19;

public class Task {
    public static void main(String[] args) {

        //TODO: On iki öğrencinin notlarını bir tamsayı dizisi değişkeninde saklayın. Bu notların ortalamasını bulan bir Java programı yazınız.
        //TODO: Notlar: 56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45

        int[] notlar = {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        double ortalama = 0.0;
        for (int i = 0; i < notlar.length; i++) {
            ortalama+=notlar[i];
        }
        System.out.printf("Öğrencilerin not ortalaması = %5.2f",(ortalama/ notlar.length));
    }
}
