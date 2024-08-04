package day11;

import java.util.Scanner;

public class RelativeOrnekler {
    public static void main(String[] args) {

        /*
            Klavyeden yaşını öğrendiğiniz bir kişiye yetişkin olup olmadığını söyleyen
            Java programını yazınız.
         */

        Scanner yas=new Scanner(System.in);
        System.out.printf("Yaşınızı giriniz = ");
        int age=yas.nextInt();

        if (age<18){
            System.out.println("Yetişkin değilsiniz.");
        }else {
            System.out.println("Yetişkinsiniz.");
        }
    }
}
