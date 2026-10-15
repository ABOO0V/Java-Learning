package Operators.LogicalOperators;

public class bool {
    public static void main (String[] args){
        

        int age = 21;

        boolean hasID = true;

        if (age >= 18 && hasID)     // দুটোই সত্য হতে হবে
        { 
            System.out.println("Allow Entry");
        } 

        else {
            System.out.println("Not Allow to Enter");
        }


    }
}
