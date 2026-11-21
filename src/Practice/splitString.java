package src.Practice;

public class splitString {
    public static void main(String[] args) {
        String str = "Amit is here An yone Wants to met him ";
        String strr = "Here is the ";

        String[] words = str.split(" ");
        System.out.println(words.length);
        System.out.println(strr);
        System.out.println(str);
    }

}


// time : O(n): split() internally poori String ko ek baar traverse
//  karta hai character by character (n = string length).
// Space: O(n) : split() ek naya array banata hai jisme saare words
//  store hote hain — yeh extra memory leta hai 
// (unlike Q5 jaha hum O(1) space mein reverse kar rahe the).