package src.Practice;

public class bigest {

    public static void findBiggest(int n1, int n2, int n3) {

        if(n1>n2){
            if(n1>n3){
                System.out.println(n1);
            }else{
                System.out.println(n3);
            }
        }else if(n2>n3){
            System.out.println(n2);
        }else{
            System.out.println(n3);
        } 
    }
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int result = Math.max(n1, Math.max(n2, n3));
        System.out.println("Biggest number is: "+result);
    }
}
