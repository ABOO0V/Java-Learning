package Loop.ForLoop;

import java.util.Scanner;

public class SumOnetoN {
    public static void main(String[] args) {
        // ১ থেকে n পর্যন্ত যোগফল:
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to n): ");
        int n = sc.nextInt(); // The limit

        int sum = 0; // The running total // যোগফল জমানোর "accumulator", শুরুতে ০

        for (int i = 1; i <= n; i++) { // The counter
            sum += i; // Add the current number // প্রতি ধাপে i-কে sum-এ যোগ
        }
        System.out.println("The sum of (1 to " + n + ") is " + sum);
        sc.close();

    }
}
// program calculates:
// 1 + 2 + 3 + ... + n
// n → tells the program where to stop.
// i → tells the program which number it is currently processing.
// sum → remembers the total accumulated so far.

// ________________________

// n
// The limit
// Stores the number entered by the user.
// Example: n = 5
// Its job is to tell the loop when to stop.

// ________________________

// i
// The counter
// Goes through the numbers one by one.
// Example: i = 1, 2, 3, 4, 5
// Its job is to track the current number.

// ________________________

// sum
// The accumulator
// Stores the running total.
// Example: 0 → 1 → 3 → 6 → 10 → 15
// Its job is to remember the result of each addition.