package DSA;

import java.util.Scanner;

public class reverseString {
    String reverse(String s, String r, int i) {
        if (i < 0) {
            return r;
        }
        return reverse(s, r + s.charAt(i), i - 1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String those u want to reverse it!!");
        String s = scan.nextLine();
        reverseString obj = new reverseString();
        System.out.println(obj.reverse(s, "", s.length() - 1));

        // String result = obj.reverse("Amit", null, 0);
        scan.close();
    }

}

// complexicity
// time : O(n) -- n character ek baar call huva
// Space : O(n) -- n baar Stack me gya aur call huva (Recursive call huva)

// Suummery : it give the retur in ReverseString those who given by the User to
// find the Reverse String
// First create class the name of the String is s,r,i if(i<0) return r ; this is
// the base case mtlb yhi stop hogaa
// than after doing this creat Recurcive Function method return
// reverse(s,r+s.charAt(i),i-1) ;
// than close the curely bracket created with the class
//  than ve go for the public static void main 
// here  we take for user input of scanner the class name is scan we can write anything 
//  and after we createing this Scanner class we have to import the import java.util.scanner;
// fir print krwaya terminal me show krega System.out.println("Enter your String thode we want to reverse it");
// than String s = scan.nextline(); this is only for the String value it cant work on intiger value for sure 
// the creat method to call it the name is same to public class  reverseString obj = new reverseString ();
// than we print the result system.out.println(obj.revese(s, "",s.length()-1));
//  than if u remember we take user input Scanner class than here we have to close it as well as to using scan.close();
// than close the both bracket than go for run  
// after giveing a String value for example "Amit" the output is timA thats it keeep learning keep coding 
