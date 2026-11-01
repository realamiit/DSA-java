package src.Practice;


public class bigest {

    public static void Biggest(int n1, int n2, int n3) {

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
        Systen.out.println(Biggest(24, 22, 15));
    }
}
