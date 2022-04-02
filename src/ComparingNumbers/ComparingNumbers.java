package ComparingNumbers;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        int a,b,c;

        Scanner comp = new Scanner(System.in);

        System.out.print("Enter your first value: ");
        a = comp.nextInt();

        System.out.print("Enter your second value: ");
        b = comp.nextInt();

        System.out.print("Enter your third value: ");
        c = comp.nextInt();

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.println("a<b<c");
            }
            else {
                System.out.println("a<c<b");
            }
        }
        if ((b<a) && (b<c)){
            if (a<c){
                System.out.println("b<a<c");
            }
            else {
                System.out.println("b<c<a");
            }
        }
        if ((c<a) && (c<b)){
            if (a<b){
                System.out.println("c<a<b");
            }
            else {
                System.out.println("c<b<a");
            }
        }
    }
}
