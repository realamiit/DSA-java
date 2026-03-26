import java.util.*;
public class LearnList2 {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(21);
        list.add(24);
        list.add(25);

        System.out.println(list);
        System.out.println(list.get(0));   //get invoke element


//    change the index value from the Array 0th element
        list.set(0 ,88);
        System.out.println(list);

//       Add element in Array
        list.add(4 , 55);
        System.out.println(list);

//    remove element from this Array
        list.remove(2);
        System.out.println(list);
    }


}
