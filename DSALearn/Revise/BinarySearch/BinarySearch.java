package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10 ,45, 7,89,23};
        int target = 89;
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i] == target);
        }
    }

}


//     public static void main(String[] args) {
//         int[] arr = {10 ,45, 7,89,23};
//         int target = 89;
//         for(int i =0; i < arr.length; i++){
//             if(arr[i] == target){
//               System.out.println(i);
//               return;
//             }   
//         }
//         System.out.println(-1);
//     }

// }

// complexity
//  time : O(n) because baar baar loop chl rha hai (leanera Search slow hai )
// Space : O(1) no extra Space use while the Duiring the Compilation

//ye biinarySearch hai dekho Agar 100 logo me  agar hme Amit ko dhudhana hai to 
//   pwhwla Approch kya hoga? "yhi n ki bari bari se sabke sath 
// jaye aur puche ki Amit ho vo bolega Amit nhi 
// dusra : Amit nhi, tisra : Amit nhi , fourth :Amit nhi ........."
// aise sba khege fir agar Agar maan le ki mil gyaa 
// maan le ki amit 55  bari me mil gya iske pehele 
// dekha kitne logo ke paas jake hm logo ne dekha 
// ki kitne loog the 100 log the fir bhi sbke yha bari bari 
// se jake sbse verify kiya fir mil apna targeted name "Amit hai" 
// 
// code ko dry run krte hai 
// pehele int[] arr name ka variable bnaya fir uske undr 
// Store kiya dheer Sari indexing me no {10 ,45, 7,89,23} 
//  fir ye krne ke baad deek aur variable int target diya = 89;
// than After  dooing this hmene for loop lagaya entire the 
//  logic than we had to first loop in (int i=0;kyuki hme 0 se start krni is liye 
// hai kyuki any arry of indexing will be Start on 0 thats why er take 0 fir 
// uske again i >= num.length yha hamri i ki jo valu hai vo badi hogi than arr.length mtalb
//  ass me jitni bhi indixing hogi mtlb jitne vhi value hai sbke  no ofko dekha fir i++ kar diya
//  i++ krne ka mtlb ki eek indexing cheak hone ke baad vo next index pe jayega thats why we take mtlb 10 ke bad ,45 ->7 ... );
// than we go to implement are logic than go to the System.out.println(aar[i]==target)
//  than after this logic hmara targeted valu mil jayega this is the behind the logic of the code 
//  aur ha the output in false peeli bar me nhi mila false same issu 3 sari baar me mila than vha true return hoga baki sare false  hoge 


// second intigrate the if else condation (same logic usme hoga like arr[i] == target){
// than hm log system.out.println krke [i] fir return krwa dege fir hm } bar  jake system .out.peintln(-1) me 
//  its work like else if execution is true tha exit other wise false




