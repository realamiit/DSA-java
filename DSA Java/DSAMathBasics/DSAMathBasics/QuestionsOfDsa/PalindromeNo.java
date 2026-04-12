package QuestionsOfDSA;

import java.util.Scanner;

public class PalindromeNo {
    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;   // last digit
            reverse = reverse * 10 + digit;
            num = num / 10;        // remove last digit
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }

}


// Time Complexity → O(log n)
// Space → O(1)


// // in leetcode 

// class Solution {
//     public boolean isPalindrome(int x) {
//         int sum = 0, target = x;
//         while (x > 0){
//             int temp = x % 10 ;
//             x = x/10;
//             sum = sum *10+ temp;
//         }
//         return sum == target;
//     }
// }