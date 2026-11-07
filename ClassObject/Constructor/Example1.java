package ClassObject.Constructor;

class Book {
    String title;
    double price;

    Book(String t, double p) {
        title = t;
        price = p;
    }

    // Book(String title, double price) {
    // this.title = title; // বাম পাশ: object-এর field, ডান পাশ: ইনপুট
    // this.price = price;
    // }
    // this.title = “এই Book-এর title field”
}

public class Example1 {
    public static void main(String[] args) {

        // class ClassName {
        // type field;
        // ClassName(type param) { // নাম = class-এর নাম, return type নেই
        // field = param;
        // }
        // }

        // constructor
        // class ClassName {
        // type field1;
        // type field2;

        // ClassName(type field1, type field2) {
        // this.field1 = field1;
        // this.field2 = field2;
        // }
        // }
        // ClassName obj = new ClassName(value1, value2);

        Book book1 = new Book("Asman", 100);
        Book book2 = new Book("Ontim", 350);

        System.out.println(book1.title + " Cost = " + book1.price);
        System.out.println(book2.title + " Cost = " + book2.price);

    }
}
