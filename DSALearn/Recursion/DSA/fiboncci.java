package DSA;

public class fiboncci {
    int fib(int n){
        if(n==0) return 0;  //  base Case 
        if(n==1) return 1;

        return fib(0) + fib(1);   // Recursive case (Function)
    }
    public static void main(String[] args) {  // main 
        fiboncci obj = new fiboncci();   
        int result = obj.fib(5);
        System.out.println(result);
    }

}
