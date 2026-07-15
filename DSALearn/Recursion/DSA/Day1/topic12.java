package DSA.Day1;


public class topic12 {
    public static void main(String[] args) {
        int[] num = {12, 45, 7, 89,23};
        int max = num[0];

        for(int i = 1; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Sabse bad mai hu maliik : " + max);
    }

}
  // find the max of this given arr array 
  //  biggest no of this array find out of this num arr