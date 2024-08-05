package day13;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
            Klavyeden userName ve password bilgisi alınacaktır.
            Eğer her iki veri doğru ise "Yönetim sayfasına hoşgeldiniz" mesajı verilecektir.
            Eğer parola yanlış ise "Yanlış parola girdiniz. Lütfen tekrar deneyiniz." mesajı verilecektir.
            Eğer kullanıcı adı yanlış girilmiş ise "Lütfen sistem yöneticisi ile irtibat kurunuz" mesajı verilecektir.
         */
        String kullaniciAdi="sinan";
        String parola="java";

        Scanner input=new Scanner(System.in);
        System.out.printf("Kullanıcı adını giriniz : ");
        String userName=input.next();
        System.out.printf("Şifrenizi giriniz : ");
        String password=input.next();

        if (userName.equals("sinan") & password.equals("java")){
            System.out.println("Yönetim sayfasına hoşgeldiniz");
        } else if (!password.equals("java")) {
            System.out.println("Yanlış parola girdiniz. Lütfen tekrar deneyiniz.");
        } else if (!userName.equals("sinan")) {
            System.out.println("Lütfen sistem yöneticisi ile irtibat kurunuz");
        }
    }
}
