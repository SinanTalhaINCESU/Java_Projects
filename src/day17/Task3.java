package day17;

public class Task3 {
    public static void main(String[] args) {
        // Task: 0'dan 100'e kadar olan sayılardan hem 5'e hem de 2'ye tam bölünebilen sayıları ekrana yazdıran
        // Java programını yazın.

        for (int i = 0; i <=100 ; i++) {
            if (i%10==0){
                System.out.print(i);
            }
            if (i%10==0 & i<100){
                System.out.printf(" - ");
            }
        }
    }
}
