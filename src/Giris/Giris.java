package Giris;

import java.awt.*;
import java.util.Scanner;

public class Giris {
    //String[] args bir parametre. metod içinde kullanmak için
    public static void main(String[] args) { //main metodu program çalıştığında buradan başlar
   /*     System.out.println("Merhabana merhaba");
        int age = 30 , temperature = 35; // aynı satırda tanımlama
        // çalıştırmak için kısayol control + R
        System.out.println(age);
        System.out.println(temperature);
        //sout kısayol

        //primitive'de değişiklik olmaz bu işlemleri yapınca
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        // reference modelde memorydeki objecti depolar. point1 ve point2 aynı değeri reference ederm
        //yani point objesinde bir değer değiştirilirse diğer point'te etkilenir.
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        short ilk = 130;
        System.out.println(ilk);
        float ikinci = 3.14f;
        System.out.println(ikinci);
        String isim = "mehmet";
        System.out.println(isim);
        int a = 3;
        int b =32;
        System.out.println(b%a); // mod alma
        b += a; // b = b + a'ya eşittir.
        System.out.println(b);

        boolean y1 = true;
        String mesaj = (y1)? "dogru":"yanlis"; //y1'den gelen true ise dogru yazdırır.
        int deger = (y1)? 1:0; // y1'den gelen true ise 1 atar değilse 0
        System.out.println(deger);
        System.out.println(mesaj);

*/
        int j;
        System.out.print("A sayisini giriniz: ");
        Scanner girdi = new Scanner(System.in); //girdi nesnesini ürettik
        j = girdi.nextInt();
        System.out.println(j);


    }
}
