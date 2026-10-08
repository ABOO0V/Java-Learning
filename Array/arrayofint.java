package Array;

public class arrayofint {
    public static void main (String[] args)
    {

        int[] array_of_integers = {32, 35, 75, 53, 54, 84, 66, 63, 624, 634, 44 };

        // To find out how many elements an array has, use the length property:

        System.out.println(array_of_integers.length); //11

        for (int i = 0; i < array_of_integers.length; i ++)
        {
            System.out.println(array_of_integers[i]);
        }


    }
}
