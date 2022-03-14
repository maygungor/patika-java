package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayiyi giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1.Toplama\n2.Çarpma\n3.Çıkarma\n4.Bölme");
        System.out.println("Seçiminiz: ");
        select=input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çarpım: "+ (sayi1*sayi2));
                break;
            case 3:
                System.out.println("Çıkarma: "+(sayi1-sayi2));
                break;
            case 4:
                switch (sayi2) {
                    case 0:
                        System.out.println("İşlem yapılamadı.");
                        break;
                    default:
                        System.out.println("Bölüm: "+ (sayi1/sayi2));
                        break;
                }
                break;
            default:
                System.out.println("Geçersiz rakam girildi.");

        }



    }
}
