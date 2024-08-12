package day18;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
            Klavyeden veri okumak üzere aşağıda istenenleri gerçekleştiriniz.
            1. Matematik işlemleri
            2. Alan ve Çevre Hesaplama
            3. Çıkış

            Alt Menü | Matematik İşlemleri
            1. Faktöriyel Hesaplama
            2. Mutlak Değer Alma
            3. Çıkış

            Alt Menü | Alan ve Çevre Hesaplama
            1. Dikdörtgen
            2. Kare
            3. Daire
            4. Çıkış
         */
        String secim=showMainMenu().toUpperCase();
        switch (secim){
            case "1":
                String mathSecim=showSubMenuMath().toUpperCase();
                if (mathSecim.equals("1")){
                    System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz: ");
                    System.out.println("Sonuç = "+faktoriyel(new Scanner(System.in).nextInt()));
                } else if (mathSecim.equals("2")) {
                    System.out.print("Mutlak değeri hesaplanacak sayıyı giriniz: ");
                    int mutlak=new Scanner(System.in).nextInt();
                    //System.out.printf("Sonuç = %d",mutlak>0?mutlak:-mutlak);
                    System.out.printf("Sonuç = %d",Math.abs(mutlak));
                }else if (mathSecim.equals("Q")){
                    System.out.println("Programdan çıkıldı.");break;
                }else {
                    System.out.println("Yanlış seçim yaptınız.");break;
                }
                break;
            case "2":
                String geoSecim=showSubMenuGeoCounting().toUpperCase();
                switch (geoSecim){
                    case "1":
                        System.out.println("Dikdörtgen için;");
                        System.out.print("Uzun kenar = ");
                        int uKenar=new Scanner(System.in).nextInt();
                        System.out.print("Kısa kenar = ");
                        int kKenar=new Scanner(System.in).nextInt();
                        //System.out.println("Dikdörtgenin Alanı = "+uKenar*kKenar);
                        //System.out.println("Dikdörtgenin Çevresi = "+2*(uKenar+kKenar));
                        int alan=alanHesapla(uKenar,kKenar);
                        System.out.printf("Alan = %d",alan);
                        int cevre=cevreHesapla(uKenar,kKenar);
                        System.out.printf("Cevre = %d",cevre);
                        break;
                    case "2":
                        System.out.print("Kare için kenar uzunluğu = ");
                        int kenar=new Scanner(System.in).nextInt();
                        System.out.println("Karenin Alanı = "+Math.pow(kenar,2));
                        System.out.println("Karenin Çevresi = "+4*kenar);
                        break;
                    case "3":
                        System.out.println("Daire için yarıçap uzunluğu = ");
                        double yaricap=new Scanner(System.in).nextDouble();
                        System.out.println("Dairenin Alanı = "+Math.PI*Math.pow(yaricap,2));
                        System.out.println("Dairenin Çevresi = "+2*Math.PI*yaricap);
                        break;
                    case "Q":
                        System.out.println("Programdan çıkıldı.");break;
                    default:
                        System.out.println("Yanlış seçim yaptınız.");break;
                }
                break;
            case "Q":
                System.out.println("Programdan çıkıldı.");break;
            default:
                System.out.println("Yanlış seçim yaptınız.");break;
        }
    }

}