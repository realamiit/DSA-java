// imoprt java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class LearnQueue {
    public static void main(String[]args){
        Queue <Integer> queue = new LinkedList<>();

////         it throw Execption also 
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // queue.add(40);
        // queue.add(60);

//       both are same work

//// offer return Boolean & don't return Execption also
        queue.offer(80);
        queue.offer(90);
        queue.offer(100);
        queue.offer(110);

        System.out.println(queue);

        // System.out.println(queue.poll());
        // System.out.println(queue);

        // System.out.println(queue.peek());
        // System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        
    }

}
