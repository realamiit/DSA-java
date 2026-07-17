package Day1.practice;

public class reverseArrWithoutCreatingNewArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }

}


// time: O(n)  for loop ki wjh  se 
// space: O(1)no  use extra space its constant 