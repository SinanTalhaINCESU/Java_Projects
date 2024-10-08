package day11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
            TASK: Klavyeden iki ayrı kareye ait kenar bilgisi girilecektir.
            Her iki karenin alanını hesaplayan metodu yazınız. Elde edilen sonuçları kıyaslayıp
            hangi karenin alanının daha büyük olduğunu belirtiniz.

            1. kenar1 ve kenar2 değerlerini klavyeden okuyup saklayınız.
            2. public static int alanHesapla(int kenar) metodunu yazınız.
            3. main metodu içinden alanHesapla(k) metodunu kenar1 ve kenar2 için çağırınız.
            4. dönen sonuçları alan1 ve alan2'de saklayınız.
            5. if ile alan1 ve alan2'nin <,> ve eşit olma durumunu ekrana yazdırınız.
         */

        Scanner input=new Scanner(System.in);
        System.out.printf("İlk karenin kenar uzunluğunu girin = ");
        int kare1=input.nextInt();
        System.out.printf("İkinci karenin kenar uzunluğunu girin = ");
        int kare2=input.nextInt();

        int alan1=alanHesapla(kare1);
        int alan2=alanHesapla(kare2);

        if (alan1<alan2){
            System.out.println("Kare2'nin alanı kare1'den daha büyüktür.");
        } else if (alan1>alan2) {
            System.out.println("Kare1'in alanı kare2'den daha büyüktür.");
        }else {
            System.out.println("İki karenin alanları eşittir.");
        }
    }

    public static int alanHesapla(int kenar){
        int alan=kenar*kenar;
        return alan;
    }
}
