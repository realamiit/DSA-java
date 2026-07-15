package DSA.Day1.practice;

public class bigiestNumInThreeNum {
    public static void main(String[] args) {
        int n1=24;
        int n2=7;
        int n3=110;
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

}

// biggest num in 3 numbers 
