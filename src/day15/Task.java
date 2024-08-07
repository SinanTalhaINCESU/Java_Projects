package day15;

public class Task {
    public static void main(String[] args) {
        //TODO: İki tamsayı değişkenine değerleri assign ediniz.
        /*
            Önce bunları isimleri ve değerleriyle birlikte ekrana yazdırınız.
            Daha sonra iki değişkenin değerlerini yer değiştirip ekrana tekrar yazdırınız.
         */

        int x=3, y=5;
        System.out.println("x = "+x+" y = "+y);
        int z=x;
        x=y; y=z;
        System.out.println("x = "+x+" y = "+y);
    }
}
