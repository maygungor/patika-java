package Taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int acilis = 10,km,minTutar = 20;
        double kmUcret = 2.20,tutar;

        Scanner taksi = new Scanner(System.in);

        System.out.print("Gidilen kilometre: ");
        km = taksi.nextInt();

        tutar = km*kmUcret;

        tutar = (tutar>20)? tutar:minTutar;

        System.out.print("Toplam tutar: "+tutar + " TL");




    }
}
