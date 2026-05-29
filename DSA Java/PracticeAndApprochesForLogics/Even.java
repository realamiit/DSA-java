import java.util.Scanner; // 1. Import the Scanner class
public class Even {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
       if(n % 2 == 0 ){
        System.out.println("YOUR GIVEN NUMBER IS Even (True)");
       }else
     System.out.println("YOUR GIVEN NUMBER IS Odd (Flase)");
    }

}
