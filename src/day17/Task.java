package day17;

public class Task {
    public static void main(String[] args) {
        // Task: 0'dan 20'ye kadar olan çift sayıları ekrana yazdıran Java programını yazın.
        for (int i = 0; i <= 20; i+=2) {
            System.out.print(i);
            if (i<20){
                System.out.printf(" - ");
            }
        }
    }
}
