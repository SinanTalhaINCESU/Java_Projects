package day14;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
            Kullanıcı tarafından girilen 3 adet sayıdan en büyüğünü ekrana yazdıran Java programını yazın.
        */

        Scanner input=new Scanner(System.in);
        System.out.printf("1. sayıyı giriniz = ");
        int a=input.nextInt();
        System.out.printf("2. sayıyı giriniz = ");
        int b=input.nextInt();
        System.out.printf("3. sayıyı giriniz = ");
        int c=input.nextInt();

        if (a>b & a>c){
            System.out.println("En büyük sayı = "+a);
        }else if (a<b & b>c){
            System.out.println("En büyük sayı = "+b);
        }else {
            System.out.println("En büyük sayı = "+c);
        }
    }
}
