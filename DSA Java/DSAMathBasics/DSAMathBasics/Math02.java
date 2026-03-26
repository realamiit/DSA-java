import java.util.Scanner;
public class Math02 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Basic operations
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division by zero not allowed");
        }

        // Even or Odd
        if (a % 2 == 0) {
            System.out.println(a + " is Even");
        } else {
            System.out.println(a + " is Odd");
        }

        // Maximum
        int max = (a > b) ? a : b;
        System.out.println("Max number: " + max);

        // Factorial
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + a + " is: " + fact);

        sc.close();
    }
}

