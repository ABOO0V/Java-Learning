
package ClassObject;

class Student {
    String name;
    int age;
}

public class ClassObjectDemo {
    public static void main(String[] args) {

        // Class
        // syntax
        // class ClassName {
        // type fieldName;
        // type fieldName;
        // }

        // class Student {
        // String name;
        // int age;
        // }

        // object
        // ClassName objectName = new ClassName();
        // Student s1 = new Student();

        // value pass
        // objectName.fieldName = value; // বসানো
        // objectName.fieldName // পড়া


        Student s1 = new Student();
        s1.name = "Alvada";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Johan";
        s2.age = 20;


        System.out.println(s1.name + " " + s1.age);
        System.out.println(s2.name + " " + s2.age);

    }
}