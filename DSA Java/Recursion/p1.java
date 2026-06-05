public class p1 {

    void print(int n) {
        if (n == 0) // base case : bs yhi rokna hai
            return;

        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        p1 obj = new p1(); // object bnaya method Static nhi hai
        obj.print(5);

    }
}
