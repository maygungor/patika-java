package ArtikYil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yil giriniz: ");
        yil = inp.nextInt();

        if ((yil % 4 == 0) || (yil % 400 == 0 )) {
            System.out.println(yil + " bir artik yildir !");
        }
        else{
            System.out.println(yil + " bir artik yil degildir !");
        }
    }
}
