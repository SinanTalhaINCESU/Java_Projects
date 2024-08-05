package day14;

public class MaxNumber {
    public static void main(String[] args) {
        /*
            Atanan 3 sayıyı karşılaştırıp en büyüğünü ekrana yazdıran Java programını yazın.
         */

        int x=1,y=2,z=3;

        if (x>y & x>z){
            System.out.println(x);
        } else if (x<y & y>z) {
            System.out.println(y);
        }else {
            System.out.println(z);
        }
    }
}
