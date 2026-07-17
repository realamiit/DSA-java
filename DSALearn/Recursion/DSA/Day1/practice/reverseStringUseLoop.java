package Day1.practice;

public class reverseStringUseLoop {
    public static void main(String[] args) {
        String arr = "Amit";
        for (int i = arr.length() - 1; i >= 0; i--) {
            System.out.println(arr.charAt(i));
        }
    }

}


// Time: O(n) no take extra time 
// Space : O(1) it is also constant