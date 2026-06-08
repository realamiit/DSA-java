package DSALearn.Recursion.DSA; 
public class p2 {
    int factorial(int n){
        if(n <= 1)
            return 1;   // base case mtlb return 1

        // recurcive call i: means he call itself 
        return n* factorial(n-1);   
    }
    public static void main(String[] args) {
        p2 obj = new p2();
        int result = obj.factorial(6);
        System.out.println("Factorial is :: " + result);
    }

}




// create a class first in classs 
// if n is greater than = 1  than base case is stop  recursion me base case bohot important hota hai kyki
// hme ye define krna hiota hai n ki kha tk run krega nhi to hmare ram ki to whatt lg jayegii  agr function n=1 
// rha to return return 1 hoga nhi to function infinity call hoga ; and  than finelly its time to Recurcivr call
 // ye function khud ko call  krr rha hai (return n* factorial(n-1));  return me jayega n* factorial(n-1) mtlb ydi hme 5 ka factorial nikalrna hoga
// to hm yha pe 5 se pehele ke sare value mtlb 4 ko miltiply krege mtlb  ye hmesha khudko call krta hai ye hmesha case case ke hi aata hai usualy 
// for example agr factorial 6 ka chahiye to :6 * factorial(5)  
// basicaly recursion ka 3 major rule hota hai 
// 1 function kya kaam ktrwga 
// factorial(n)
// 2 base case if (n<=1) return 1;
// 3 smaller probleam (factorial (n-1) 
// Sollution  
// 1 factorial 1 = 1 
// 2 factorial 1  = 2
// 3 factorial 2  = 6
// 4 factorial 6 = 24
// 5 factorial 24 = 120
// 6 factorial 5  = 720  

//   like this we find the recursion



// Rules — Dhyan se padh!
// 1. Pehle notebook mein socho — phir type karo
// 2. Hint maangne se pehle 5 min khud try karo
// 3. Har problem ke baad complexity likho
// 4. Copy mat karna — haath se type karo
// 5. Galti ho toh bhi paste karo — main dekhta hoon