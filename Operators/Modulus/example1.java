package Operators.Modulus;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        // % (Modulus)
        // জোড়/বিজোড় নির্ণয়: n % 2 == 0 হলে জোড়।

        
        // int x = 10;
        // x += 5;    // x = x + 5  → 15
        // x -= 3;    // x = x - 3  → 12
        // x *= 2;    // x = x * 2  → 24
        // x++;       // x = x + 1  → 25
        // x--;       // x = x - 1  → 24


        int num = 9;

        if (num % 2 == 0) {
            System.out.println("The number is evan");
        }

        else {
            System.out.println("The number is odd");
        }

        
        
        
        
        
        // take number from user and check that number is even or odd

        Scanner sc = new Scanner(System.in);

        System.out.print( "Enter Your Number: ");  //এখানে print() ব্যবহার করেছি, যাতে user একই line-এ input দিতে পারে।

        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Your number " + number + " is Even");
        }

        else {
            System.out.println("Your number " + number + " is odd");
        }

        sc.close();






    }
}
