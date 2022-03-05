package NotOrtalamasi;

import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, tarih, turkce, muzik, kimya;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Turkce Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Muzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        double ort = (mat + fizik + tarih + turkce + muzik + kimya) /6;

        boolean y1 = ort >=60;

        String mesaj = (y1)? "Sınıfı Geçti":"Sınıfta Kaldı";

        System.out.println("Ortalamanız: "+ort);
        System.out.print(mesaj);



    }

}
