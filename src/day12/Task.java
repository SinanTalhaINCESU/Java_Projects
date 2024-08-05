package day12;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //TODO:Aşağıdaki Java programını geliştiriniz.
        /*
            Verilen bir sayının hem 5 hem de 2'ye tam bölünüp bölünmediğini bulan java programını yazınız.
         */

        Scanner input=new Scanner(System.in);
        System.out.printf("Bir sayı giriniz = ");
        int sayi=input.nextInt();

        if (sayi%10==0){
            System.out.println("Sayı 2 ve 5 ile kalansız bölünür.");
        }else {
            System.out.println("Sayı 2 ve 5 ile kalansız bölünmez.");
        }
    }
}
