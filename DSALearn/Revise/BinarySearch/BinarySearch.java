package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10 ,45, 7,89,23};
        int target = 89;
        for(int i =0; i<= arr.length; i++){
            System.out.println(arr[i] == target);
        }
    }

}


// complexity
//  time : O(n) because baar baar loop chl rha hai 
// Space : O(1) no extra Space use while the Duiring the Compilation