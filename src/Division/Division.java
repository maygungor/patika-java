package Division;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max;
        int total = 0;
        int count = 0;
        double average = 0;

        System.out.print("Enter a number: ");
        max = inp.nextInt();

        for (int i = 1; i <= max; i++){
            if (i % 3 == 0 && i % 4 == 0){
                total = total + i;
                count++;
            }
        }
        average = (total / count);
        System.out.println("Average is " + average);
    }
}
