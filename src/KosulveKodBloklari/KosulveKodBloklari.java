package KosulveKodBloklari;

public class KosulveKodBloklari { //KosulveKodBloklari bir class
    public static void main(String[] args) { // main bir method
        int a=9,b=10,c,d;
        System.out.println(a==b);
        int day = 1;

        // && and
        // (|| or) işaret için klavyede option + -

        c = (a == b) ? 1:0; //a, b'ye eşit ise c=1, değilse c=0
        System.out.println(c);
        // else if
        if(a ==b){
            System.out.println("Eşittir.");
        }else {
            System.out.println("Eşit değildir.");
        }
        //switch'e değer giriyor şuna eşitse(case) şunu yap diyoruz. Case'lerin içine break. Hiç uymazsa sona default
        //switch sadece eşitliği kontrol eder.
        switch (day) {
            case 1:
                System.out.println("Bugün Pazartesi");
                break; //break yazılmazsa alttaki case'leri de çalıştırır.

            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Çarşamba");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
                break;
        }
    }
}
