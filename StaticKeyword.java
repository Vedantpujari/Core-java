class Student {

    String name;
    static String college = "ABC College";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

        Student student1 = new Student("Vedant");
        Student student2 = new Student("Rahul");

        student1.display();

        System.out.println();

        student2.display();
    }
}
