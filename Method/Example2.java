public class Example2 {

    // void লেখা থাকলে মেশিন কিছু ফেরত দেয় না, শুধু কাজ করে
    // int লেখা থাকলে মেশিন একটা মান ফেরত দেয়

    static void userName(String Name) {
        System.out.println("Hello " + Name);
    }

    public static void main(String[] args) {
        userName("Alvada");
        userName("John");
        userName("Oliver");

    }
}
