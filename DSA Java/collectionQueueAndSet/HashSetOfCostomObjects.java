import java.util.*;

// this is a normal Class in java 
class Student{
    int rollNo;
    String Name;

    public Student(int rollNo, String Name){
        this.rollNo = rollNo;
        this.Name = Name;
    }
}
public class HashSetOfCostomObjects {
    public static void main(String[]args){
        Set<String> set = new HashSet<>();

        set.add("Amit");
        set.add("Ayush");
        set.add("Nirman");
        set.add("Amit");

        System.out.println(set);


    }

}
