package DSA;

public class fiboncci {
    int fib(int n){
        if(n==0) return 0;  //  base Case 
        if(n==1) return 1;

        return fib(n-1) + fib(n-2);   // Recursive case (Function)
    }
    public static void main(String[] args) {  // main 
        fiboncci obj = new fiboncci();   
        int result = obj.fib(5);
        System.out.println(result);
    }

}

// complexity
// Time : O(2^n)  har call 2 aur calls karta hai 
// Space : O(n)  Stack depth n tak aati hai  

//  time complexity :O(2^n) ye Slow hai! baad 
// me hm ise Dynamic programming (DP) se fast  krege!!
 
// Summerization 
// isme 2o base case bne hai  pehele (n==0) aur (n== 1) ke liye ye dono
//  base case hai jo ki Screen me fk\loat kr rhe hai  
//   aur eek recursive case hai  jo verify kr rha hai dono base case
//  ye return me jo pehele hai (n-1) hai vha hm (n-0) agr rkhe to
//   koyi issu nho hoga but output badlega aisa is liye hoga kyuki
//  n-0 = n hi hota hai thats why we use here 1 
// fir main me same jaise phele kiye the 
