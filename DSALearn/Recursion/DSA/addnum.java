package DSA;
public class AddNum {
    int addNumber(int n){
       if(n <= 0)  // base case  
        return 0;
    return n + addNumber(n-1);  //  Recursive_call
     }
     public static void main(String[] args) {
        AddNum obj = new AddNum();

        int result = obj.addNumber(5);
        System.out.println("Added number is : "+result);

     }
}

// Add a number 
// pehele int AddNumber name ka class bnaya than intiger in int n 
// than after it apply if condation (n<1)  lets understatand the
//  in different way ydi n is grreater than are equal to 1 than return 1; it means 
// close because this is the base case  than ve cove on the recurcive function or case 
// than close the curly bracket an move for the main AddNum class ka name ke name se eek object bnaya 
// are equal to new AddNum(); close adding more and than  than close int result namwee ka variable 
// bnaya fir obj.AddNumber me hmmne valuu  bhi diya kyukii hme kitne numberds ko add krnmee hai hmree 
// batana hota hai kitne  than we go for next step output dena hoga System .out.println (result);
//  than hme mil jayega expected ouutput right 


/*pattern Basic Recursion
trigger :jab ko operation n baar repeat ho har baar n ko ghata ke 
template : 
if(n<=0) return Basic_value;
  returnf(n) + recursive_call (n-1);
key Inside:  Base case hmaesha sabse pehele socho kyuki hme in real life bhi khi jane se pehele base case yni destination deside krte hai ki kha rukna hai like this
                         n<=0 use karo n<=1 nhi -edge case bacha hai 
     compelxity  :
     Time : O(N) and Space: O(N) call stack ki wjaha se    
 */