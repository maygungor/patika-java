package PassClass;

import java.util.Scanner;

public class PassClass {
    public static void main(String[] args) {
        double math, turkish, chemistry,physics,music;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your math score: ");
        math = inp.nextInt();

        System.out.print("Enter your turkish score: ");
        turkish = inp.nextInt();

        System.out.print("Enter your chemistry score: ");
        chemistry = inp.nextInt();

        System.out.print("Enter your physics score: ");
        physics = inp.nextInt();

        System.out.print("Enter your music score: ");
        music = inp.nextInt();

        double average;

        if (turkish>0 && turkish<100){
            if (chemistry >0 && chemistry<100){
                if (music >0 && music<100){
                    if (physics >0 && physics<100){
                        average = (math + turkish + chemistry + music + physics ) / 5;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }else{
                        average = (math + turkish + chemistry + music ) / 4;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }
                }else{
                        if (physics >0 && physics<100){
                        average = (math + turkish + chemistry + physics ) / 4;
                            if (average <55){
                                System.out.println("Kaldiniz");
                            }
                            else {
                                System.out.println("Gectiniz");
                            }
                        }else{
                        average = (math + turkish + chemistry) / 3;
                            if (average <55){
                                System.out.println("Kaldiniz");
                            }
                            else {
                                System.out.println("Gectiniz");
                            }
                        }
                }
            }else {
                if (music >0 && music<100){
                    if (physics >0 && physics<100){
                        average = (math + turkish + music + physics ) / 4;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }else{
                        average = (math + turkish +  music ) / 3;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }
                }else{
                    if (physics >0 && physics<100){
                        average = (math + turkish + physics ) / 3;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }else{
                        average = (math + turkish ) / 2;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }
                }
            }
        }else{
            if (chemistry >0 && chemistry<100){
                if (music >0 && music<100){
                    if (physics >0 && physics<100){
                        average = (math +chemistry + music + physics ) / 4;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }else{
                        average = (math + chemistry + music ) / 3;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }
                }else{
                    if (physics >0 && physics<100){
                        average = (math +  chemistry + physics ) / 3;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }else{
                        average = (math +chemistry) / 2;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }
                }
            }else {
                if (music >0 && music<100){
                    if (physics >0 && physics<100){
                        average = (math + music + physics ) / 3;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }else{
                        average = (math +music ) / 2;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }
                }else{
                    if (physics >0 && physics<100){
                        average = (math + physics ) / 2;
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }else{
                        average = (math);
                        if (average <55){
                            System.out.println("Kaldiniz");
                        }
                        else {
                            System.out.println("Gectiniz");
                        }
                    }
                }
            }
        }

    }
    }

