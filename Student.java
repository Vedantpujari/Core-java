package playingwithobjects.methodchaining;

public class Student {

    private int id;
    private String name;
    private int age;
    private String course;
    private double percentage;

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setCourse(String course) {
        this.course = course;
        return this;
    }

    public Student setPercentage(double percentage) {
        this.percentage = percentage;
        return this;
    }

    public void displayDetails() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
        System.out.println("Percentage   : " + percentage);
    }
}
Main.java
  package playingwithobjects.methodchaining;

public class Main {

    public static void main(String[] args) {

        Student student = new Student()
                .setId(101)
                .setName("Vedant")
                .setAge(22)
                .setCourse("Computer Engineering")
                .setPercentage(78.5);

        student.displayDetails();
    }
}
