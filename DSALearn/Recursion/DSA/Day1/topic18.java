package DSA.Day1;

public class topic18 {
    public static void main(String[] args) {
       String arr = "Hello world";
        for(int i = arr.length()-1; i>=0; i--){
        System.out.print(arr.charAt(i));
            
        }
        System.out.println(arr.length());   // arr ki length hai 11  (its unennasary line)
    }

}

// to reverse the String this merhod apply  
// character ko reverse kiya the approch is  pehele string se d nikala condation (i>=0) fir i-- krke l fir (i>=0) i-- fir 
// aise hi baar baar loop chlega 11 times kyuki hmlogo  ne 11 arr ki length nikal liya to using arr.length(); 
// that's wy we will conferm it the array length is 11 as well as
 //complexicty 
//   Time : O(n) ==> character baar baar print  ho rha hai 
// space : O(1)  ==> extra space nhi liya 