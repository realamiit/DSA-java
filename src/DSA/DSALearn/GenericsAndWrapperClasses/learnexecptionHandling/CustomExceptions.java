package src.DSA.DSALearn.GenericsAndWrapperClasses.learnexecptionHandling;

import java.util.Scanner;

public class CustomExceptions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        try {
            if (age > 100) {
                throw new MyException("More than 100 not Allowed");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }
}
