package Day1;

import java.util.Scanner;
// import java.util.*;

public class topic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();

        System.out.println(name);   
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0)); 

        sc.close();

    }

}

// pehele Scanner liya for input and import on before class ant than
// use to print name
// use to print arr length '
// use to the user print in upper case

// print charAt to know the character to know thethere Index of chat at which no
// is Store on that place 
// output is: 
// Enter Your Name
// Amit Gupta 
// Amit Gupta 
// 11
// AMIT GUPTA 
// A
