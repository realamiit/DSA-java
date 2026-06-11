package DSA;

public class square {

    int  power(int x,int n){
    if(n == 0) return 1;      // base case
    return x * power(x, n-1);    //  recursive Function
    }
    public static void main(String[] args) {
        square obj = new square();
         int result = obj.power(2,6);
         System.out.println(result);
    }
}

// (2,5) = 2*2*2*2*2*2 = 64  this is the Expected ouutput
// cheak the condation after 
// shown there base case  ydi n == 0 than return 1 
// than after done it call recursive Function return x * power(x * n-1); than close tbe brackat
//  than go to  main and make an object 
// int result = obj.power the power is the name of method (x:2,n:6 ) aur ye dono bracket me both are parameater
//  after understanding this 
//  go for the System.out.println(result) print krwayege 
//  yha ya in this line System ka matlab hai => basickly ye java ki inbuild class hai aur kuch nhi 
// out => output stream hai ye bolta hai outputt ke bahr jaoo
// println => he is always saying ki print if u want somthing and go out of this particular line it means print and go to next line 
// (result) => the result is also return the those we want to print anything or expected things also
