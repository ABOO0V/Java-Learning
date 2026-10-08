package Array;

public class example2 {
    public static void main(String[] args) {

        int[] sumNumber = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int i = 0; i < sumNumber.length; i++) {
            sum += sumNumber[i];
        }

        System.out.println("The total number sum is " + sum);

    }
}
