package Daire;

import java.util.Scanner;
import java.lang.Math;

public class Daire {
    public static void main(String[] args) {
        int yaricap;
        double pi = 3.14,merkezAci;
        Scanner cevreAlan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap = cevreAlan.nextInt();

        System.out.print("Dairenin merkez açısını giriniz: ");
        merkezAci = cevreAlan.nextDouble();

  /*      double cevre = 2*pi*yaricap;
        double alan = pi*Math.pow(yaricap,2);

        System.out.println("Dairenin çevresi: "+ cevre);
        System.out.print("Dairenin alanı: "+ alan); */

        double dilimAlan = (pi*(Math.pow(yaricap,2))*merkezAci)/360;

        System.out.print("Dairenin dilim alanı: "+dilimAlan);


    }
}
