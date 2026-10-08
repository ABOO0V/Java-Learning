package Loop.ForLoop;

public class example2 {
    public static void main (String[] args)
    {

        System.out.println("Even number");

        for (int i = 2; i <= 20; i += 2) 
        {
            System.out.println("Your even number is " + i);
        }

        System.out.println();
        System.out.println("Odd Number");

        for (int i = 1; i <= 20; i += 2)
        {
            System.out.println("Your odd number is " + i);
        }
    }
}

// for(initialization; condition; updation) {
// }