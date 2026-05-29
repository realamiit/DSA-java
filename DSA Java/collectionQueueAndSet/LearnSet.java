import java.util.*;
public class LearnSet {
    public static void main(String[]args){
// We can use HashSet because it return the time complexicity of O(n)
        // Set<Integer> set =  new HashSet<>();  // TC is: O(n)
        // Set<Integer> set =  new LinkedHashSet<>(); // TC is: O(n)
        Set<Integer> set = new TreeSet<>();  // TC is: O(logn)

        set.add(22);
        set.add(44);
        set.add(66);
        set.add(11);
        set.add(44);  // it cant print because in HashSet we can say features or
    // function if we can store the valu than it can cant repet this again
    // for example supose we have A Box than we store the many data rendomly like:(22,33,22,55)
    // it can't gaive output [55,33,22,22,] tha output we got from this code [55,22,33,11] it cat take 
    // 22 again in oun code 

       set.remove(66);
       System.out.println(set.contains(11));
        

        System.out.println(set);

    }

}
