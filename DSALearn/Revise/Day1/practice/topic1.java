package Day1.practice;

import java.util.Scanner;

public class topic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<=4; i++){
            System.out.println("Enter your "+ (i+1) + " no");
            int num = sc.nextInt();

            int sum = num+num;
            System.out.println(sum);
            
        }
        sc.close();
    }

}
