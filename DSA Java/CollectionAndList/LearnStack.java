import java.util.*;
public class LearnStack {
    public static void main(String[]args){
        Stack <String> fruits = new Stack<>();
        fruits.push("A");
        fruits.push("B");
        fruits.push("C");
        fruits.push("D");
        fruits.push("E");

        // pop the element From this Stack

        System.out.println(fruits.pop());
        System.out.println(fruits.pop());

//      all Stack
        System.out.println(fruits);

        // peek the Element
        System.out.println(fruits.peek());
        System.out.println(fruits);

        // it return the output in the form of boolean (true or false)
        System.out.println(fruits.empty());
//           both are equal also
        System.out.println(fruits.isEmpty());

    }

}
