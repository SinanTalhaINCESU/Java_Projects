package day10;

public class Task {
    public static void main(String[] args) {

        /*
            Kenar uzunluğu verilen bir karenin alan hesaplaması yapılacaktır. Bunun için karenin alanını geriye
            döndüren bir metot tasarlayınız. Daha sonra bu metodu main metodu içerisinden çağırarak
            iki farklı karenin alanlarını toplayınız. Metot ismi alanHesapla olacaktır.
         */
        int kare1=alanHesapla(3);
        int kare2=alanHesapla(5);
        System.out.println("Karelerin alanları toplamı = "+(kare1+kare2));
    }

    public static int alanHesapla(int kenar){
        int alan=kenar*kenar;
        return alan;
    }
}
