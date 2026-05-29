import java.util.*;

public class LearnpriorityQueue {

    public static void main(String[]args){

        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        pq.add(10);
        pq.add(25);
        pq.add(8);
        pq.add(20);
        pq.add(20);
        pq.add(66);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}


// by default it will return the value of the entire code 
// in Assending order 8, 10, 20,25
// the output is :

// [8, 20, 10, 25, 20, 66]
// 8
// [10, 20, 66, 25, 20]
// 10
// [20, 20, 66, 25]
// 20
// [20, 25, 66]
// 20
// [25, 66]
// 25


// even if we put in side 
// Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
// this:  (a,b)->b-a
// the output is Desending order  25,20,10,8   

// the output is:
// [66, 20, 25, 10, 20, 8]
// 66
// [25, 20, 8, 10, 20]
// 25
// [20, 20, 8, 10]
// 20
// [20, 10, 8]
// 20
// [10, 8]
// 10