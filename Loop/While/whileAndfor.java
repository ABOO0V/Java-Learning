public class whileAndfor {
    public static void main(String[] args) {

        System.out.println("While Loop");
        // while loop
        int i = 1; // 1. Initialization (loop-এর বাইরে)

        while (i <= 5) { // 2. শর্ত: true থাকলে ভেতরে ঢুকবে
            System.out.println("Count: " + i);
            i++; // 3. Update (ভুলে গেলে loop কখনো শেষ হবে না!)
        }
        // আউটপুট: Count: 1 ... Count: 5

        System.out.println("For Loop");
        // for loop
        for (int integer = 1; integer <= 5; integer++) { // তিনটা অংশ এক লাইনে
            System.out.println("Count: " + integer);
        }
    }
}
