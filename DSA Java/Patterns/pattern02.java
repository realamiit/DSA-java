import java.io.*;

public class pattern02 {

    public static void main (String[] args){

        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream("output.txt"));
        for(int i = 0; i<=5;i++){
            for(int j=0; j<=i; j++)
                System.out.println("*");
        }
        System.out.print("*");

    }
}
