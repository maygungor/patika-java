package UcakBileti;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int mesafe, yas, yolculuk;
        double ucret;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculuk = inp.nextInt();

        ucret = mesafe * 0.1;

        if (yas > 0 && mesafe>0 && ((yolculuk == 1) || (yolculuk ==2))) {
            if (yas < 12) {
                ucret = (ucret / 2);
                if (yolculuk == 2) {
                    ucret = ((ucret - ((2 * ucret) / 10))*2);
                }
                System.out.println("Toplam Tutar: " + Math.round(ucret) + " TL");
            }
            else if (yas >= 12 && yas < 24) {
                ucret = (ucret - (ucret / 10));
                if (yolculuk == 2) {
                    ucret = ((ucret - ((2 * ucret) / 10))*2);
                }
                System.out.println("Toplam Tutar: " + Math.round(ucret) + " TL");
            }
            else if (yas > 65) {
                ucret = (ucret - ((3 * ucret) / 10));
                if (yolculuk == 2) {
                    ucret = ((ucret - ((2 * ucret) / 10))*2);
                }
                System.out.println("Toplam Tutar: " + Math.round(ucret) + " TL");
            }
            else {
                ucret = ucret;
                if (yolculuk == 2) {
                    ucret = ((ucret - ((2 * ucret) / 10))*2);
                }
                System.out.println("Toplam Tutar: " + Math.round(ucret) + " TL");
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
