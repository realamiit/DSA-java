package BinarySearch;

public class BinarySearch2 {
    int[] arr = { 5, 3, 5, 8, 7, 9, 5, 2, 5 };
    int target = 5;

    public static void main(String[] args) {
        BinarySearch2 obj = new BinarySearch2();
        int count = 0;
        for (int i = 0; i < obj.arr.length; i++) {
            if (obj.arr[i] == obj.target) {
                count++;
            }

        }
        System.out.println(count + " Baar aaya hai");
    }

}

// array banayaaa 9 size ka usme theer integers liya
// than set a target 5
// fir main banaya main ke unde ka code kuch is trh hai
// jo hmne class bnayi hai the namw is BinarySearch2 isi ko use krke eek object
// bnaya obj se
// than count krwaya count ko valu diya 0;
// than go for for loop chlaya (int i = o; i<obj.arr.length; i++){
// if (obj.arr[i]==obj.target){
// count++;
// }}
// print krwa diya( count) ko kitni baar aaya hai target value print kr dega
// yami output is 4 hoga
