package QuestionsOfDSA;

import java.util.Scanner;

public class ReverseNumber {
    // static int reverse(int num) {
    //     int rev = 0;

    //     while (num > 0) {
    //         int digit = num % 10;     // last digit
    //         rev = rev * 10 + digit;  // build reverse
    //         num = num / 10;          // remove last digit
    //     }

    //     return rev;
    // }

    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter a number: ");
    //     int num = sc.nextInt();

    //     int result = reverse(num);

    //     System.out.println("Reversed Number: " + result);

    //     sc.close();
    // }

    public static int reverseNum(int num) {
    
        int reversedNum = 0;
         while(num > 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
         }
         return reversedNum;
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");
        // int num = sc.nextInt();

        // int result = reverseNum(num);

        // System.out.println("Reversed Number: " + result);

        // sc.close();

        System.out.println(reverseNum(-2347));
    }

}
