package Kullanici;

import java.util.Scanner;

public class Kullanici {
    public static void main(String[] args) {
        String userName,password,sifirla,yeniSifre;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine(); //string için nextline

        System.out.print("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if ((userName.equals("patika")) && (password.equals("1234"))){
            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Bilgileriniz yanlış");
            if ((!password.equals("1234")) && (userName.equals("patika"))){
                System.out.print("Şifreniz yanlış. Şifrenizi sıfırlamak ister misiniz?(E/H) ");
                sifirla = inp.nextLine();
                if (sifirla.equals("E")){
                    System.out.print("Yeni şifrenizi giriniz: ");
                    yeniSifre =inp.nextLine();
                    if(yeniSifre.equals(sifirla)){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.println("Şifre oluşturuldu.");
                    }
                }


            }
        }
    }
}
