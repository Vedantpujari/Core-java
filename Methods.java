public class Methods {

    // Method without parameters
    static void greet() {
        System.out.println("Hello, Java!");
    }

    // Method with parameters
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // Method with return value
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        greet();

        add(10, 20);

        int result = square(5);
        System.out.println("Square: " + result);
    }
}
