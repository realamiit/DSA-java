public class Math11 {
    public static void main(String[] args){
        int num1 = 7;
        int num2 = 3;

        int num = num1 / num2;  // the actual  output is 2.5 in mathemetical way but it return 2 because 
        //                        we insert intiger valu and this is (2.5) float value
        System.out.println(num);

        int num3 = -2134566432; //INT_MIN
        int num4 = -1;

        int ans = num3 / num4;
        System.out.println(ans); 
    }
}

// complexity
// Time => O(1)
// Space => O(1)
// because its constant


