import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;


public class LearnDeque {

    public static void main(String[]args){

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(55);
        dq.offerFirst(44);
        dq.offerLast(66);

        System.out.println(dq);    
    }

}
