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
