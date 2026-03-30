import java.util.Scanner;

public class Math07MathToolkit {

    // GCD using Euclidean Algorithm
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // this is the LCM using GCD 
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Math Toolkit =====");
        System.out.println("1. Find GCD");
        System.out.println("2. Find LCM");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("GCD: " + gcd(a, b));
                break;
            case 2:
                System.out.println("LCM: " + lcm(a, b));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}





