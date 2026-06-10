package DSA;

public class square {
    // power (2,5) = 2*2*2*2*2 = 32
    int  power (int x,int n){
    if(n == 0) return 1; // base case
    return n * power(x, n-1); 
    }
    public static void main(String[] args) {
        square obj = new square();
         int result = obj.power(2,5);
         System.out.println(result);
    }

}
