package Loop.DoWhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // do {
        // Code block to be executed
        // Update statement (e.g., i++)
        // } while (condition);

        int i = 1;
        do {
            System.out.println("i = " + i);
            i++; // Updates the loop variable
        } while (i <= 3);

        System.out.println();
        int a = 1;
        do {
            System.out.println("a = " + a);
            a++;
        } while (a <= 10);

    }
}
