public class operations {
    public static void main(String[] args) {
        // Define two numbers
        double num1 = 10, num2 = 5;

        // Perform arithmetic operations
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        // Avoid division by zero
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}