package BinarySearch;

public class BinarySearch1 {
    int[] arr = {2,5,8,12,16,23,38,45};
    int target = 23;
    int left = 0;
    int right = arr.length - 1;

    public static void main(String[] args) {
        BinarySearch1 obj = new BinarySearch1();
      while(obj.left <= obj.right){
        int mid = (obj.left + obj.right)/2;
        if(obj.arr[mid] == obj.target){
        System.out.println("Found at Index : "+mid);
        break;
      }else if(obj.arr[mid] < obj.target){
        obj.left = mid + 1 ;
      }else{
        obj.right = mid - 1 ;
      }
    }
    }
}
