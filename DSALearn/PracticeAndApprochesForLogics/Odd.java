import java.util.Scanner;
public class Odd {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your no");
        int n = sc.nextInt();
        if(n %2 ==1){
            System.out.println("YOUR GIVEN NUMBER IS Odd (True)");
        }else
            System.out.println("YOUR GIVEN NUMBER IS Even (False)");
    }

}
