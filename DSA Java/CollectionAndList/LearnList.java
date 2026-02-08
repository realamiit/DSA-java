// import java.utli.ArrayList;
// import java.utli.List;
    import java.util.*;
public class LearnList {
    public static void main(String[]args){
        // int a[] = newInt[5];            // this one also static


        List<Integer> list = new ArrayList<>();   //its Dynamic in Nature
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(27);
        list.add(28);
        list.add(29);
        list.add(30);

        System.out.println("I Am Collection of Array: "+list);
        System.out.println("My size is: "+list.size());

        System.out.println(list.contains(25));

        list.remove(5);
        System.out.println("I am removeing this Index from this Array : "+list);


        list.remove(Integer.valueOf(30));
        System.out.println("I am removeing this Element from this Array : "+list);
        
    }

}
