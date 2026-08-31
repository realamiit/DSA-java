
public class Pattern04 {

    public static void pattern(int n) {
        for(int i = 0; i <= n; i++ ) {
            for(int j = 0; j < i-1; j++) {
                System.out.print(i+1);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        pattern(6);
        
        // int n = 18;
        // for(int i=0; i<n-1; i++){
        //     for(int j=0; j<i-1; j++){
        //         System.out.print(i+1);
        //     }
        //     System.out.println(" ");
        // }
    }

}
