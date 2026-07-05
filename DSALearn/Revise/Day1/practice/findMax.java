package Day1.practice;

public class findMax {
    public static void main(String[] args) {
        int[] num = {12, 45, 7, 89, 23};
        int max = num[0];
        for(int i=0; i<num.length; i++){
            if(num[i] > max){      // if we go with < we get smallest num in array
                max=num[i]; 
            }
        }
        System.out.println("Sabse bada mai hi hu malliiik muje aapne dhudh liya: " + max);
    }

}
//  complexicity
// time : O(n) Array ka element baar baar cheak ho rha hai 
// space: O(1)  because sirf max variable extra use kr rha hai space, koyi array koyi structure nhi le rha 

// Dry run:
// max = num[0] = 12
// i=0: num[0]=12, 12 > 12? No → max stays 12
// i=1: num[1]=45, 45 > 12? Yes → max = 45
// i=2: num[2]=7, 7 > 45? No → max stays 45
// i=3: num[3]=89, 89 > 45? Yes → max = 89
// i=4: num[4]=23, 23 > 89? No → max stays 89