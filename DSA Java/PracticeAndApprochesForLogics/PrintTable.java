import java.util.Scanner;
// import java.io.*;
public class PrintTable {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your no which u want to print Table ");
       int n = sc.nextInt();
        // int n =6;
        for(int i=1; i<=10; ++i)
            System.out.println(n+ "*" + i + "=" + n * i);
        
    }

}
