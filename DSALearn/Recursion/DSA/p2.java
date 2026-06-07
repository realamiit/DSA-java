package DSALearn.Recursion.DSA; 
public class p2 {
    int factorial(int n){
        if(n <= 1)
            return 1;
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        p2 obj = new p2();
        int result = obj.factorial(6);
        System.out.println("Factorial" + result);
    }

}


