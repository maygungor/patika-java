package ChineseZodiac;

import java.util.Calendar;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year;
        String burc = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        year = inp.nextInt();

        if (year>0 && year<calendar.get(Calendar.YEAR)){
            if (year % 12 == 0){
                burc = "Maymun";
            }
            if (year % 12 == 1){
                burc = "Horoz";
            }
            if (year % 12 == 2){
                burc = "Kopek";
            }
            if (year % 12 == 3){
                burc = "Domuz";
            }
            if (year % 12 == 4){
                burc = "Fare";
            }
            if (year % 12 == 5){
                burc = "Okuz";
            }
            if (year % 12 == 6){
                burc = "Kaplan";
            }
            if (year % 12 == 7){
                burc = "Tavsan";
            }
            if (year % 12 == 8){
                burc = "Ejderha";
            }
            if (year % 12 == 9){
                burc = "Yilan";
            }
            if (year % 12 == 10){
                burc = "At";
            }
            if (year % 12 == 11){
                burc = "Koyun";
            }
            System.out.println("Çin Zodyağı Burcunuz : "+burc);

        }
        else {
            System.out.println("Yanlis yil girdiniz");
        }


    }
}
