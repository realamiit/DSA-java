package Day1.practice;

public class countNegativeAndPositive {
    public static void main(String[] args) {
        int[] arr = {10, -5, 3, -8, 7, -4, 9, 1, -3, 12 };
        int positive = 0;
        int negative = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                positive++;
            }if(arr[i] < 0){
                negative++;
            }
            
        }
        System.out.println("Mere paas "+ positive + " Positive Number's hain");
            System.out.println("Mere paas "+ negative +" Negative Number's hain");
    }

}


// summery for the better understanding
//  pehele array bnaya 10 issse hme chaiye positive aur kitne negative numbers hai uisko bntana hai hme 
// pehele 2 intigers hai positive = 0 and negative = 0 hai than for loop chlayege pehene (int i=o; i<arr.length; i++) 
// fir loop chlame ke bad hm loog if condation chlayege (arr[i] > 0) ye consation ke baad positive ++ krege fir eek aur 
// if (arr[i] < 0) is condation ke baad bbhi hm cheak krege negative ke liye than after this   
//  prin krwayege apna possitive and negative alg alg print krwayege 

// Complexity
// Time: O(n) Array ke har element ko ek baar visit kar rahe ho.
// Space: O(1) Sirf do extra variables positive, negative use ho rahe hain, array size pe depend nahi karte.
