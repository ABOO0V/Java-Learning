package Loop.BreakandContinue;

public class Break_Continue {
    public static void main(String[] args) {
        // break = break out of a loop (stop)
        // continue = skip current iteration of a loop (skip)

        System.out.println("Break");

        for (int i = 0; i <= 10; i++) {
            if (i == 8) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Continue");
        for (int i = 0; i <= 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.print(i + " ");
            // 8 is missing in output
        }

    }
}
