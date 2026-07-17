public class printNumbers {
    public void printNumber(int n){
    if(n == 0) return;
    printNumber(n-1);
    System.out.println(n);
    }
    public static void main(String[] args) {
        printNumbers obj = new printNumbers();
        obj.printNumber(5);
    }
}


// User input 

// package DSA;
// import java.util.Scanner;
// public class printNumbers {
//     public void printNumber(int n){
//     if(n == 0) return;
//     printNumber(n-1);
//     System.out.println(n);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number");
//         printNumbers obj = new printNumbers();
//         int print = sc.nextInt();
//         obj.printNumber(print);

//         sc.close();
//     }

// }

// time complexity : O(2^n) 
// Space Complexity : O(1)  because no use of extra Spaces
