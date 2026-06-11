package DSA;

import java.util.Scanner;

public class reverseString {
    String reverse(String s , String r, int i){
        if(i<0){
            return r;
        }
        return reverse(s,r+s.charAt(i),i-1);
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String those u want to reverse it!!");
        String s = scan.nextLine();
        reverseString obj = new reverseString();
        System.out.println(obj.reverse(s,"",s.length()-1));

        
        // String  result = obj.reverse("Amit", null, 0);
        scan.close();
    }

}
