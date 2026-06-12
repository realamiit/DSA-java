package DSA;
public class addnum {
    int addnumber(int n){
       if(n <= 1)  // base case  
        return 1;
    return n + addnumber(n-1);  //  Recursive function
     }
     public static void main(String[] args) {
        addnum obj = new addnum();

        int result = obj.addnumber(5);
        System.out.println("Added number is : "+result);

     }
}

// Add a number 
// pehele int addnumber name ka class bnaya than intiger in int n 
// than after it apply if condation (n<1)  lets understatand the
//  in different way ydi n is grreater than are equal to 1 than return 1; it means 
// close because this is the base case  than ve cove on the recurcive function or case 
// than close the curly bracket an move for the main addnum class ka name ke name se eek object bnaya 
// are equal to new addnum(); close adding more and than  than close int result namwee ka variable 
// bnaya fir obj.addnumber me hmmne valuu  bhi diya kyukii hme kitne numberds ko add krnmee hai hmree 
// batana hota hai kitne  than we go for next step output dena hoga System .out.println (result);
//  than hme mil jayega expected ouutput right 
