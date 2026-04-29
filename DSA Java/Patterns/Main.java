import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream("output.txt"));

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}