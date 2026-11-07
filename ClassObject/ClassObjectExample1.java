package ClassObject;

class Book {
    String title;
    double price;
}

public class ClassObjectExample1 {

    public static void main(String[] args) {

        // Class
        // syntax
        // class ClassName {
        // type fieldName;
        // type fieldName;
        // }

        // object
        // ClassName objectName = new ClassName();
        // Student s1 = new Student();

        // value pass
        // objectName.fieldName = value; // বসানো
        // objectName.fieldName // পড়া

        Book book1 = new Book();
        book1.title = "GOT";
        book1.price = 2000;

        Book book2 = new Book();
        book2.title = "Physics";
        book2.price = 500;

        System.out.println(book1.title + " costs " + book1.price);
        System.out.println(book2.title + " costs " + book2.price); 

    }

}
