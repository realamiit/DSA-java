package BinarySearch;

public class BinarySearch2 {
    int[] arr = { 5, 3, 5, 8, 7, 9, 5, 2,5 };
    int target = 5;

    public static void main(String[] args) {
        BinarySearch2 obj = new BinarySearch2();
        int count = 0;
        for (int i = 0; i < obj.arr.length; i++) {
            if (obj.arr[i] == obj.target) {
                count++;
            }

        }
        System.out.println(count);
    }

}

// 
