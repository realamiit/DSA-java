import java.util.*;

// this is a normal Class in java 
class Student {

    int id;
    String name;   // ✅ YOU ARE MISSING THIS

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashSetOfCostomObjects {
    public static void main(String[]args){
        Set<Student> set = new HashSet<>();

        set.add(new Student(3, "Amit"));
        // set.add(new Student(3, "Ayush"));
        // set.add(new Student(3, "Nirman"));
        set.add(new Student(3,"Amit"));

        System.out.println(set);


    }

}
