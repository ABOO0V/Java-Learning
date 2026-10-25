package String;

public class StringEquals {
    public static void main(String[] args) {

        String a = "Yes";
        String b = "yes";
        System.out.println(a.equalsIgnoreCase(b)); // বড়-ছোট হাতের পার্থক্য উপেক্ষা করতে চাইলে: a.equalsIgnoreCase(b)
        System.out.println(a.equals(b));

        String x = "Hello World";
        String y = "Hello world";
        System.out.println(x.equalsIgnoreCase(y));
    }
}
