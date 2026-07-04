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
           
        }
           System.out.println("Sum: " + sum);
            double average = sum / 5.0;
            System.out.println("Average: " + average);
            
        sc.close();
    }

}

//  dry run to better understanding
// i=0: num=1, sum=1
// i=1: num=2, sum=3
// i=2: num=3, sum=6
// i=3: num=4, sum=10
// i=4: num=5, sum=15
// Loop khatam → print "Sum: 15" → average = 15/5.0 = 3.0

// complexicity 
// time : O(n)  => 5 numbers ke liye loop ek baar chal raha hai (n = number of inputs)
// space : O(1) => Sirf sum, num, average — fixed variables, koi extra array nahi.