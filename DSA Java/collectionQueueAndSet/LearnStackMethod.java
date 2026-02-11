import java.util.*;
public class LearnStackMethod {

    public static void main(String[] args){

        ArrayDeque<Integer> stack = new ArrayDeque<>();
//    Stack Implementation using the ArrayDeque 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack.peek());        

//     Queue implementation using ArrayDeque
   
       ArrayDeque<Integer> queue = new ArrayDeque<>();

       queue.offer(30);
       queue.offer(31);
       queue.offer(32);
       queue.offer(33);

       System.out.println("queue"+queue);

       System.out.println(queue.pop());


    }

}
