public class ConditionalStatements {
    public static void main(String[] args) {

        int age = 20;

        // if statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // if-else statement
        if (age >= 18) {
            System.out.println("Eligible.");
        } else {
            System.out.println("Not eligible.");
        }

        // if-else-if ladder
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // Nested if
        int number = 10;

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive even number");
            } else {
                System.out.println("Positive odd number");
            }
        }

        // switch statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
