package String;

public class StringLoop {
    public static void main(String[] args) {
        String text = "Hello world";

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        System.out.println();

        String name = "ABCDEFGH";

        for (int i = 0; i < name.length(); i++) {
            // System.out.println(name.charAt(i));
            System.out.print(name.charAt(i));
        }
    }
}
