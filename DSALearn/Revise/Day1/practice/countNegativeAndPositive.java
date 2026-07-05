package Day1.practice;

public class countNegativeAndPositive {
    public static void main(String[] args) {
        int[] arr = {10, -5, 3, -8, 7};
        int possitive = 0;
        int negative = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                possitive++;
            }if(arr[i] < 0){
                negative++;
            }
            
        }
        System.out.println("Mere paas "+ possitive + " Possitive Number's hain");
            System.out.println("Mere paas "+ negative +" Negative Number's hain");
    }

}

// Complexity
// Time: O(n) Array ke har element ko ek baar visit kar rahe ho.
// Space: O(1) Sirf do extra variables positive, negative use ho rahe hain, array size pe depend nahi karte.
