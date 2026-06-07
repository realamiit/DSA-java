package Day1;

public class topic15 {
    public static void main(String[] args) {
        for(int i = 1 ; i<= 6;i++){
            for(int j=1; j<i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

}

// compelxicity : 
// Time  O(nScuare)
// Space complexicity is also not O(n) because it will take no more extra Space it the code
