package QuestionsOfDSA;

public class SumOfDigits {


    public static void sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; // extract last digit
            sum += digit;         // add to sum
            num /= 10;            // remove last digit
        }

        System.out.println("Sum of digits = " + sum);

    }

    public static void main(String[] args) {
        int number = -23456788;
        sumOfDigits(number);
    }
}