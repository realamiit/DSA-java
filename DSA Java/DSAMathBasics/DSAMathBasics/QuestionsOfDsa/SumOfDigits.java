package QuestionsOfDSA;

public class SumOfDigits {
<<<<<<< HEAD
=======
    package QuestionsOfDsa;

public class SumOfDigits {
>>>>>>> 86e3b0c2763d32e5fee50e5c6511f3f519b94d54

    public static void sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; // extract last digit
            sum += digit;         // add to sum
            num /= 10;            // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
<<<<<<< HEAD
=======
    }

    public static void main(String[] args) {
        int number = 23456788;
        sumOfDigits(number);
        
>>>>>>> 86e3b0c2763d32e5fee50e5c6511f3f519b94d54
    }

    public static void main(String[] args) {
        int number = 23456788;
        sumOfDigits(number);
    }
}