
public class Example2 {
    public static void main(String[] args) {

        // Traffic light

        String color = "Yellow";

        switch (color) {
            case "Red":
                System.out.println("Stop!");

                break;
            case "Green":
                System.out.println("Go...");
                break;

            case "Yellow":
                System.out.println("Hold.");
                break;

            default:
                System.out.println("Unknown");
        }
    }
}
