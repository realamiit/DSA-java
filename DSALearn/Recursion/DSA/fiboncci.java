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
