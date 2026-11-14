
// syntax
// class ClassName {
//     type field;

//     void methodName() {
//         // কাজ (field সরাসরি ব্যবহার করা যায়)
//     }
// }

// // ডাকা:
// objectName.methodName();

class Book {
    String name;
    double price;

    Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showInfo() {   // নতুন: Method static
        System.out.println(name + ", Cost is " + price + " Taka");
    }


    double discountprice () {  // discount price 
        return price * 0.9;
    }
}

public class Example1 {

    public static void main(String[] args) {

        Book book1 = new Book("Jotokhon tumi insaf er pokkha", 200);
        Book book2 = new Book("ami sobuj balobashi", 199);
        Book book3 = new Book("Atomic Habit", 700);
        Book book4 = new Book("Asman", 100);
        Book book5 = new Book("Ubuntu", 0);

        book1.showInfo();
        book2.showInfo();
        book3.showInfo();
        book4.showInfo();
        book5.showInfo();

        System.out.println("After discount: " + book1.discountprice());

    }

}
