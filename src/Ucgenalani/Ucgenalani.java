package Ucgenalani;

import java.util.Scanner;
import java.lang.Math;
public class Ucgenalani {
    public static void main(String[] args) {
        int a,b,c;
        Scanner ucgen = new Scanner(System.in);

        System.out.print("Üçgenin ilk kenarının uzunluğunu giriniz: ");
        a = ucgen.nextInt();

        System.out.print("Üçgenin ikinci kenarının uzunluğunu giriniz: ");
        b = ucgen.nextInt();

        System.out.print("Üçgenin üçüncü kenarının uzunluğunu giriniz: ");
        c = ucgen.nextInt();

        int u = a+b+c;

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

       //double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

       //System.out.print("Üçgenin hipotenusu: " + c);

        System.out.print("Üçgenin alanı: "+alan);



    }
}
