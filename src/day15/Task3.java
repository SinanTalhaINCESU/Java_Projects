package day15;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Kullanıcı tarafından girilen sayının tek mi çift mi olduğunu bulan Java programını yazın.

        System.out.printf("Bir sayı giriniz = ");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();

        if (sayi%2==0){
            System.out.printf("%d sayısı çifttir.",sayi);
        }else {
            System.out.printf("%d sayısı tektir.",sayi);
        }
    }
}
