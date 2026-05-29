package Day1;

public class detail {
    String name;
    int age;
    double cgpa;

    void features() {
        System.out.println("meraa name " + name + "mera age " + age + "mera CGPA overall" + cgpa + " hai thanku");
    }

    public static void main(String[] args) {
        detail s = new detail();

        s.name = "Amit";
        s.age = 22;
        s.cgpa = 8.8;

        s.features();

    }
}


// firrst create  an class than fir usme insertkiya for store name String name is liye string rkha kyuki hme name mane ko baar baar change nhi krna hoyta hhaia 
//is liye hme name ko string me hi store krna hota jai fir age ko string me store nhi kr skye kyuki ye eek aisi value hogi jisme number store krwa skte hai but one more thin
// in string we can store  number but in the in intiger we can't use character also this is the also goo thing to remember 
// than go for cgpa in cgpa we always see there value is always decimal value hoti hai than there we can create (8.8) we can put in same value 
// but we can also put this value (8.8) in string but not intiger we store in value String  
// aur ha jo double value hota h usko hm agr intiger me rkhna chahe to ddecimal ye point ke baad jo bhi value hoti hai means right side ki sarii value ko automatic cut kr leta hai 
// ye yaad rkhna hmesha hr jagh kaam aayega 
// fir main me usi  class ko  ko details s =  new  detail(); likha ye class ke name se barabr hota hai aur ha isko hm string data type hai jisme ko name ; age , cgpa Store rkhta hai aur ye bohot hi important things hain  keep in mind also
//   fir usme usi datatype ke name ka eek s jo name diya tha uski use se hm name age cgpa storee krwayege 
// fir s. features() ki help se calll krege 
// fir usi ko use krke ab jo features me void features bnaya tha 
// void features() {
        // System.out.println("meraa name " + name + "mera age " + age + "mera CGPA overall" + cgpa + " hai thanku");
    // }

    // isko prin println krwa dege 