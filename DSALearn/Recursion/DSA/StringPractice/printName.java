package StringPractice;
import java.util.Scanner;

public class printName {
    static void printNames(String name, int n){
        if(n<=0) return;     // rucursive call 
        System.out.println(name);
        printNames(name, n-1);   // Recursive function
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter how many times to print");
        int n = sc.nextInt();
        printNames(name, n);

        sc.close();
    }
}
