package HeatEvent;

import java.util.Scanner;

public class HeatEvent {
    public static void main(String[] args) {
        int heat;

        Scanner value = new Scanner(System.in);

        System.out.print("Enter a heat value: ");
        heat = value.nextInt();

        if(heat<5){
            System.out.println("You can ski");
        }
        else if(heat>=5 && heat<15){
            System.out.println("You can go to cinema");
        }
        else if(heat>=15 && heat<=25){
            System.out.println("You can go for a picnic");
        }
        else{
            System.out.println("You can swim");
        }

    }
}
