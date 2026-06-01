package Day1;

import java.util.Scanner;

public class topic11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Optimal Sollution
        int[] arr = new int[5]; 
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter your num " + (i+1));
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum "+sum);


        double average =  (double)sum / arr.length;   // average find formula
        System.out.println("sum : " +sum);
        System.out.println("average : "+average);

        //  Brute force 
        // System.out.println("Enter Your First NumberOfArray");
        // int m1 = sc.nextInt();
        // System.out.println("Enter Your Second NumberOfArray");
        // int m2 = sc.nextInt();
        // System.out.println("Enter Your Third NumberOfArray");
        // int m3 = sc.nextInt();
        // System.out.println("Enter Your Fourth NumberOfArray");
        // int m4 = sc.nextInt();
        // System.out.println("Enter Your Fifth NumberOfArray");
        // int m5 = sc.nextInt();       

        // int[] arr = {m1 ,m2,m3,m4,m5};
        // int sum = (m1+m2+m3+m4+m5);

        // double Average = (double)sum /arr.length;
        // System.out.println(Average);

        sc.close();  // to close the scanner always remember it is a good habit
    }
}
