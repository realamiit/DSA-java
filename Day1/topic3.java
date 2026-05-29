package Day1;
import java.util.*;

public class topic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        if(marks >= 90){
            System.out.println("A Grade");
        }else if(marks >= 75){
            System.out.println("B Grade");
        }else if(marks >= 60){
            System.out.println("C Grade");
        }else if(marks >= 33){
            System.out.println("D Grade");
        }else {
            System.out.println("Fail");
        }
        

    }

}

// here ue see the output is according to are marks ;
//  user : Enter your marks = "89";
//  in the outoput section : grade B;


// lets usuderstand how its works in the code Area 
// pehele  scanner liya for taking user input fir 
// if / else condation use kiya  
// if (marks >= 90){
//   reeturn (" A Grade");
// } else if(marks >= 75){
//   return("Grade B")
// } 
// isis thr smjoo jaise ki tum user ko input de rhe ho usi ke accou=rding agr tum uske criterea me aa rhhe ho usi ke according vo tumko grade dega
// ispe bhi logics hai jo ki use hota hai ye niche dekho dry run krta huu

// this Logics Apply in this programm
//  if {
//  marks >= 90 => A GRADE
//  marks >= 75 => B GRADE
//  marks >= 60 => C GRADE
//  marks >= 33 => D GRADE
//  else        FAIL  
// }


