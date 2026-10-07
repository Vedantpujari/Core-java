class StudentData {

    String name;
    int age;

    // Constructor
    StudentData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {

    public static void main(String[] args) {

        StudentData student1 = new StudentData("Vedant", 21);
        StudentData student2 = new StudentData("Rahul", 22);

        student1.display();

        System.out.println();

        student2.display();
    }
}
