import java.util.*;
public class LinkedList {

     public static void main(String[]args){

        List<String> fruits = new java.util.LinkedList<>();

        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Litchi");
        fruits.add("Banana");
        fruits.add("Orange");

        for(int i =0; i< fruits.size();i++){
            System.out.println("This is " + fruits.get(i));
        }

        for(String fruit: fruits ){
            System.out.println("this is For each" + fruit);
        }

        Iterator<String> fe = fruits.iterator();
        while(fe.hasNext()){
            System.out.println("By Iterator invoke "+fe.next());
        }


        List<String> smallList = fruits.subList(0,4);
        System.out.println(smallList);
    }
}
