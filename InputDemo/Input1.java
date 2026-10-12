package InputDemo;

import java.util.Scanner; 
// 1. Scanner অন্য package-এ থাকে, তাই import করতে হয়

public class Input1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); // 2. কীবোর্ড থেকে পড়ার জন্য object তৈরি

        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // 3. পুরো লাইন পড়ে (স্পেস সহ)

        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // 4. একটা পূর্ণসংখ্যা পড়ে

        System.out.println("Enter you height in feet: ");
        double height = sc.nextDouble(); // 5. দশমিক সংখ্যা পড়ে

        System.out.println(name + " is " + age + " years old and " + height + " ft tall");

        sc.close(); // 6. কাজ শেষে resource ছেড়ে দেওয়া

    }
}


// Scanner হলো Java-র একটা বিল্ট-ইন class, যেটা কীবোর্ড (বা ফাইল) থেকে ডেটা পড়ে।