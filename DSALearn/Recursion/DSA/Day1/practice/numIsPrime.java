package Day1.practice;

public class numIsPrime {
    public static void main(String[] args) {
        int n = 5;

        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int dev = 2; dev * dev <= n; dev++) {
            if (n % dev == 0) {
                return false;
            }
        }
        return true;
    }
}
