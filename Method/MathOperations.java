public class MathOperations {

    // void লেখা থাকলে মেশিন কিছু ফেরত দেয় না, শুধু কাজ করে
    // int লেখা থাকলে মেশিন একটা মান ফেরত দেয়

    // sum number
    static int sumNumber(int a, int b) {
        return a + b;
    }

    // subtract number
    static int subNumber(int c, int d) {
        return c - d;
    }

    public static void main(String[] args) {
        // sum number
        System.out.println("Sum Number");
        int totalResult = sumNumber(5, 12);
        System.out.println(totalResult);

        // subtract number
        System.out.println("subtract number");
        int totalSubNumber = subNumber(6, 1);
        System.out.println(totalSubNumber);
    }
}
