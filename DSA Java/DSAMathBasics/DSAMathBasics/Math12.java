// public class Math12 {
//     public static void main(String[] args) {
//         int[] arr = {45};
//         int sum = 0;
//         for(int num : arr){
//     sum += num * num;
// }
// System.out.println(sum);
//     }
// }


public class Math12 {
    public static void main(String[] args) {
        int num = 54;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        System.out.println(sum);
    }
}