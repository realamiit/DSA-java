// import java.utli.ArrayList;
// import java.utli.List;
    import java.util.*;
public class LearnList {
    public static void main(String[]args){
        // int a[] = newInt[5];            // this one also static


        List<Integer> list = new ArrayList<>();   //its Dynamic in Nature
        List<Integer> list2 = new ArrayList<>();
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);

        list2.add(21);
        list2.add(22);
        list2.add(77);
        list2.add(30);

        System.out.println("I Am Collection of Array: "+list);
        System.out.println("My size is: "+list.size());

        System.out.println(list.contains(25));

        list.remove(5);
        System.out.println("I am removeing this Index from this Array : "+list);

        list.addAll(list2);
        System.out.println(list);
        


        list.remove(Integer.valueOf(23));
        System.out.println("I am removeing this Element from this Array : "+list);


        // list.removeAll(list2);          // for union remove

        list.retainAll(list2);                 //For intersection remove
        System.out.println(list);



        
    }

}
