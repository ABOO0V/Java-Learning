package Array;

// 'অ্যারে' (Array), যার মাধ্যমে আমরা একই ধরনের অনেকগুলো ডেটা একটি মাত্র ভেরিয়েবলের ভেতরে সংরক্ষণ করতে পারি।

public class example1 {
    public static void main (String[] args)
    {

        String[] countryName = {"USA", "UK", "UAE", "Iran", "Italy", "Spain", "Turkey", "Denmark", "Belguam"};

        System.out.println(countryName[4]);
        System.out.println(countryName[8]);
        System.out.println(countryName[6]);
        
        System.out.println();

        // To find out how many elements an array has, use the 'length' property: 


        for (int i = 0; i < countryName.length; i ++)
        {
            System.out.println(countryName[i]);
        }


    }
}
