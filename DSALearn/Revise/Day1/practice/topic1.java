package Day1.practice;

import java.util.Scanner;

public class topic1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=4; i++){
            System.out.println("Enter your "+ (i+1) + " no");
            int num = sc.nextInt();
            sum += num;

           System.out.println("Sum: " + sum);
            double average = sum / 5.0;
            System.out.println("Average: " + average);
        }
           
            
        sc.close();
    }

}
