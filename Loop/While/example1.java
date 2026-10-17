
public class example1 {
    public static void main(String[] args) {

        // 1. Initialization → শুরুর মান ঠিক করা (int i = 1)
        // 2. Condition → চালিয়ে যাব কি না পরীক্ষা (i <= 5)
        // 3. Update → মান বদলানো, যেন শেষ হয় (i++)

        int i = 1; // 1. Initialization (loop-এর বাইরে)

        while (i <= 10) { // 2. শর্ত: true থাকলে ভেতরে ঢুকবে
            System.out.println("Count " + i);
            i++; // 3. Update (ভুলে গেলে loop কখনো শেষ হবে না!)
        }

    }
}