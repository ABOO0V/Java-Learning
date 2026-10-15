import java.util.Scanner;

public class IfElseifElse {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your makres: ");
        int Marks = userInput.nextInt();

        if (Marks >= 80) {
            System.out.println("You got A+");
        }

        else if (Marks >= 60) {
            System.out.println("You got A");
        }

        else if (Marks >= 40) {
            System.out.println("You got B");
        }

        else {
            System.out.println("Fail");
        }

        userInput.close();
    }
}
