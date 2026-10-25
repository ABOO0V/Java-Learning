package String;

public class StringMethod {
    public static void main(String[] args) {

        String Name = "Hello, this is java";
        System.out.println(Name.length());
        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());
        System.out.println(Name.charAt(4));
        System.out.println(Name.contains("is")); // true কোনো লেখা আছে কি না (true/false)
        System.out.println(Name.contains("Is")); // false কোনো লেখা আছে কি না (true/false)
        System.out.println(Name.indexOf("this")); // লেখাটা কোন জায়গায় আছে
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
