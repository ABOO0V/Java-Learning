public class Example1 {

    // void লেখা থাকলে মেশিন কিছু ফেরত দেয় না, শুধু কাজ করে
    // int লেখা থাকলে মেশিন একটা মান ফেরত দেয়

    static void sayHello() {
        System.out.println("Hello, This is method in java.");
    }

    public static void main(String[] args) {
        sayHello();
        sayHello();
    }
}
