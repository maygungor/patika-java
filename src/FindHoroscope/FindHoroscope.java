package FindHoroscope;

import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args) {
        int month,day;
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Month: ");
        month = inp.nextInt();

        System.out.print("Enter day: ");
        day = inp.nextInt();

        if (month == 1){
            if (day >= 1 && day <=31){
                if (day<22){
                    System.out.println("Oğlak burcu");
                }
                else {
                    System.out.println("Kova burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 2){
            if (day >= 1 && day <=31){
                if (day<20){
                    System.out.println("Kova burcu");
                }
                else {
                    System.out.println("Balık burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 3){
            if (day >= 1 && day <=31){
                if (day<21){
                    System.out.println("Balık burcu");
                }
                else {
                    System.out.println("Koç burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 4){
            if (day >= 1 && day <=31){
                if (day<21){
                    System.out.println("Koç burcu");
                }
                else {
                    System.out.println("Boğa burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 5){
            if (day >= 1 && day <=31){
                if (day<22){
                    System.out.println("Boğa burcu");
                }
                else {
                    System.out.println("İkizler burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 6){
            if (day >= 1 && day <=31){
                if (day<23){
                    System.out.println("İkizler burcu");
                }
                else {
                    System.out.println("Yengeç burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 7){
            if (day >= 1 && day <=31){
                if (day<23){
                    System.out.println("Yengeç burcu");
                }
                else {
                    System.out.println("Aslan burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 8){
            if (day >= 1 && day <=31){
                if (day<23){
                    System.out.println("Aslan burcu");
                }
                else {
                    System.out.println("Başak burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 9){
            if (day >= 1 && day <=31){
                if (day<23){
                    System.out.println("Başak burcu");
                }
                else {
                    System.out.println("Terazi burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 10){
            if (day >= 1 && day <=31){
                if (day<23){
                    System.out.println("Terazi burcu");
                }
                else {
                    System.out.println("Akrep burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 11){
            if (day >= 1 && day <=31){
                if (day<22){
                    System.out.println("Akrep burcu");
                }
                else {
                    System.out.println("Yay burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month == 12){
            if (day >= 1 && day <=31){
                if (day<22){
                    System.out.println("Yay burcu");
                }
                else {
                    System.out.println("Oğlak burcu");
                }
            }
            else {
                isError = true;
            }
        }
        if (month >12) {
            System.out.println("Yanlış ay girdiniz");
        }

        if (isError){
            System.out.println("Yanlış gün girdiniz");
        }

    }
}
