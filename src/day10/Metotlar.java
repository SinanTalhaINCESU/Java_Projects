package day10;

import java.util.Scanner;

public class Metotlar {
    public static void main(String[] args) {
        //Verilen bir sayının karesini hesaplayan Java programını yazınız.

        int x=3;
        System.out.println("Sayının karesi = "+x*x);

        Scanner kare=new Scanner(System.in);
        System.out.print("Karesi alınacak sayıyı giriniz = ");
        int y=kare.nextInt();
        System.out.println("Sayının karesi = "+(y*y));

        kareAl();

    }

    public static void kareAl(){
        int z=6;
        int carpim=z*z;
        System.out.println("Sayının karesi = "+carpim);
    }
}
