package day09;

import java.util.Scanner;

public class TaskWithScanner {
    public static void main(String[] args) {
        /*
            TASK: Klavyeden girilen 2 sayının çarpımını bulan ve ekrana yazdıran bir Java programı yazın.
         */
        Scanner girdi=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz = ");
        int sayi1=girdi.nextInt();
        System.out.print("2. sayıyı giriniz = ");
        int sayi2=girdi.nextInt();
        int carpim=sayi1*sayi2;
        System.out.println("Sayıların Çarpımı = "+carpim);
    }
}
