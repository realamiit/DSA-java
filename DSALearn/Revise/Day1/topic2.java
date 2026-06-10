package Day1;
import java.util.*;
public class topic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Ampna name Likho");
        // String name = sc. nextLine();

        // System.out.println("Apna age likho");
        // int age = sc. nextInt();
        
        // System.out.println("Enter your Father name");
        // String fatherName = sc.nextLine();

        // System.out.println("apna roll no likho");
        // int rollNo = sc.nextInt();

        // System.out.println("Enter your Mother name");
        // String mothername = sc.nextLine();

        // System.out.println("hello" + name + "I am "+ age + "year old"+"My Father Name is "+ fatherName+ "tumhara rollno "+ rollNo+"and my mother name is "+  mothername + "Thankx");

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your cgpa");
        double cgpa = sc.nextDouble();

        System.out.println(name + " ki age " + age + " hai aur CGPA " + cgpa + " hai");     //one line sollution
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(cgpa);


        sc.close();  // close scanner class 
        
    }

}

// DSA Java\Revise> java Day1.topic2     :to run 


//scanner class pehele import hot ahaio header pe fir fir  scanner class ka koni name dete hai jaise sc diye hai isme  fir iinput lene ke liye new scanner (System.in);
// krne ke baad me sb ho jata hau 
// ab baat jo reh hati hai vo vo input me pehele kya show hoga kjisme user input dega ]
// jaise me "enter your first name " than the user give there name like "Amit " ,fir after enter the use have another input to gane "enter your last name "than the user gave 
// here gave input in there last name  "Gupta" than after doing this wiit me have to seen in code the system.out.println("enter your mane");
// String name = sc.nextLine();
// Int age = sc.nextInt();
// double cgpa = sc.nextDouble();

// uske baad me  System.out.println( name + age + cgpa); 
// iske bad  hme apna output mil jayega eekdm ache see 
// isi ke sath hm log sikh gye USER INPUT LENA thanku ("-_-")
// cs.close(); to close the scanner class it is a good practice every situvation your code looks clean and neet

