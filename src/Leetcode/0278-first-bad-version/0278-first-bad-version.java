/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {


       // Brute force and the time complexity is O(n)
        // for(int i = 0; i<=n; i++) {
        //     if((isBadVersion(i))) {
        //         return i;
        //     }
        // }
        // return -1;

        //  Optimal Sollution 

        int left = 1, right = n;

        while(left < right) {
            int mid = left+(right - left ) / 2;
            if(isBadVersion(mid)) {
                right = mid;
            } else {
                left =  mid + 1;
            }
             
        }
         return left;
    }   
    
}

//  Time Complexity is O(log n) and Oprimal sollution is we can't Optemized Actualy