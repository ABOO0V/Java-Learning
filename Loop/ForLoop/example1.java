package Loop.ForLoop;

public class example1 {
    public static void main (String[] args)
    {

        for (int i = 1; i <= 5; i++)
            {
                System.out.printf("Your nubmer is %d \n", i);
            }
    }
}


// এখানে for এর ভেতরে প্রথম অংশ int i = 1 দিয়ে আমরা লুপটি ১ থেকে শুরু করেছি।
//  দ্বিতীয় অংশ i <= 5 হলো শর্ত, যার মানে i এর মান ৫ এর সমান বা ছোট থাকা পর্যন্ত লুপটি চলতে থাকবে।
//  আর তৃতীয় অংশ i++ এর মানে হলো প্রতিবার ভেতরের কাজটি শেষ হওয়ার পর i এর মান ১ করে বেড়ে যাবে।
//  এই নিয়ম মেনে লুপটি নিজে থেকেই এক এক করে ৫ পর্যন্ত সংখ্যাগুলো প্রিন্ট করবে এবং শর্ত মিথ্যা হওয়া মাত্রই থেমে যাবে।


// 
// for(initialization; condition; updation) {
// }