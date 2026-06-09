package DSALearn.Recursion.DSA;
public class addnum {
    int addnumber(int n){
       if(n <= 1) 
        return 1;
    return n + addnumber(n-1);
     }
     public static void main(String[] args) {
        addnum obj = new addnum();

        int result = obj.addnumber(5);
        System.out.println("Added number is : "+result);

     }
}

// Add a number 
// pehele int addnumber name ka class bnaya 
