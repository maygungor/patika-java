package ManavKasa;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        int kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;
        double defArmut = 2.14, defElma = 3.67, defDomates = 1.11, defMuz = 0.95, defPatlican = 5.00;

        Scanner kasa = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        kgArmut = kasa.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        kgElma = kasa.nextInt();

        System.out.print("Domates Kaç Kilo ? :");
        kgDomates = kasa.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        kgMuz = kasa.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        kgPatlican = kasa.nextInt();

        double tutar = (kgArmut*defArmut)+ (kgElma*defElma) + (kgDomates*defDomates)
                + (kgMuz*defMuz) + (kgPatlican*defPatlican);

        System.out.print("Toplam Tutar : " + tutar + " TL");

    }
}
