package VucutKitle;

import java.util.Scanner;
import java.lang.Math;

public class VucutKitle {
    public static void main(String[] args) {
        int kilo;
        double boy;

        Scanner index = new Scanner(System.in);



        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = index.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = index.nextInt();

        double sonuc = kilo / (Math.pow(boy,2));

        System.out.print("Vücut Kitle İndeksiniz : "+ sonuc);





    }
}
