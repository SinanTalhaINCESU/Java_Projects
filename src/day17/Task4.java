package day17;

public class Task4 {
    public static void main(String[] args) {
        // TASK: 1 ile 100 arasındaki (100 hariç) tek sayıların ve çift sayıların
        // toplamlarını ayrı ayrı bulan Java programını yazın.
        int tToplam=0, cToplam=0;
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                cToplam+=i;
            }
            else {
                tToplam+=i;
            }
        }
        System.out.println(tToplam+" , "+cToplam);
    }
}
