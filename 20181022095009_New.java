package pkgnew;

import java.util.Scanner;
import java.util.Random;

public class New {

    public static void main(String[] args) {

        Random randObj = new Random();
        Scanner keyboard = new Scanner(System.in);

        int lineCount, i, j, number;
        System.out.print("How many lines? ");
        lineCount = keyboard.nextInt();
        
        for (i = 1; i <= lineCount; i++) {
            System.out.println(" ");
            number = randObj.nextInt(10);
            for (j = 0; j < 10; j++) {
                if (number == j) {
                    System.out.print("*");

                } else {
                    System.out.print("-");
                }

            }
        }

    }

}
