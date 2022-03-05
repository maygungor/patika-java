package KDVtutar;

import java.util.Scanner;

public class KDVtutar {
    public static void main(String[] args) {
        double deger;

        Scanner kdv = new Scanner(System.in);

        System.out.print("Kdv'siz tutarı giriniz: ");
        deger = kdv.nextDouble();

        boolean y1 = deger <=1000;
        double kdvOran = (y1)? 0.18:0.08;

        double sonuc = (deger*kdvOran)+deger;
        double kdvTutar = deger*kdvOran;

        System.out.println("Kdv tutarınız: "+ kdvTutar + " TL");
        System.out.print("Kdv'li tutarınız: "+ sonuc + " TL");


    }
}
