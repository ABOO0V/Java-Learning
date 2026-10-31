import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("----Help line menu----");
        System.out.println("1. Account balance chack");
        System.out.println("2. Internat package price check");
        System.out.println("3. Customar care");

        System.out.println();

        System.out.print("Select 1 to 3 number: ");

        int menu = sc.nextInt();

        System.out.println();

        switch (menu) { // switch দিয়ে সরাসরি ইউজারের চয়েস চেক করা হচ্ছে
            case 1:
                System.out.println("Your balance is $25.");

                break; // কাজ শেষ, সুইচ ব্লক থেকে বের হয়ে যাও

            case 2:
                System.out.println("1GB Internat price is $20.");
                break;

            case 3:
                System.out.println("We call Within a minute.");
                break;

            default:
                System.out.println("Pls select 1 to 3 options.");

        }
        sc.close();

    }

}