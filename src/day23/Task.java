package day23;

import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Random fyt = new Random();
        String[] cars = {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%d. %s\n", i + 1, cars[i]);
        }
        System.out.println("Lütfen bir araba seçiniz.");
        System.out.print("Seçiminiz : ");
        int secim = new Scanner(System.in).nextInt();
        int fiyat = 0;
    }
}
