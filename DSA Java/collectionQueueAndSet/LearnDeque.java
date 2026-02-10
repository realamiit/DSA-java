import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;


public class LearnDeque {

    public static void main(String[]args){

        // this type of concept use on sliding windows ke Case me 
        // jha pe hm loog eek Queue me dono side se valu le rhe ho 

        ArrayDeque<Integer> dq = new ArrayDeque<>();

//   ALWAYS USE offer, poll & peek 
//   offer -> for add
//   poll & peek -> remove for use it 

        dq.offer(55);
        dq.offerFirst(44);
        dq.offerLast(66);

        System.out.println(dq); 

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

        System.out.println(dq); 

        System.out.println(dq.peek());
        System.out.println(dq.peekLast());

        System.out.println(dq);
    }

}
