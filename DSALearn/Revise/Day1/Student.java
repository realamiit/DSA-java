package Day1;
public class Student {

    // ye field hai class ke under and main ke bahr
    String Name;
    int rollNo;
    int marks;
    int studentId;
    String result;

    // ye method hai

    void introduce() {
        System.out.println("mera Name : " + Name + " , mera rollno : , " +rollNo + " , mera marks : , " + marks + ", My result" + result+"meri ID : " + studentId);
    }

    // main object lass hai ye
    public static void main(String[] args) {
        Student s1 = new Student(); // object is here
        Student s2 = new Student();

        s1.Name = "Amit"; // this is object
        s1.rollNo = 22;
        s1.marks = 78;
        s1.result = "Pass";
        s1.studentId = 231234;

        s2.Name = "Ashish";
        s2.rollNo = 31;
        s2.marks = 82;
        s2.studentId = 23123456;

        s1.introduce(); // here calling onject here
        s2.introduce();

    }
}

// ye upr jo class bhi field aur method main() se bahr object main() ye object
// ke under hota hai hamesha 
//pehele field bnaaya mtlb classs bnaya fir usme name , rollno and marks diya fir uske baad and haa rmember
//  ye class ke under hi bnega kyuki class ke kyuki claske undr is liye rhegi kyuki 
// student ke undr ki uski khudki property rhegi n is liye field ko class ke undr likhte hai 
//  for example we  tere pass eek Adhar card hai jo ki tera hai to uske name Amit Gupta,dob 15/03/2005 amd address
//  hai ye tere adhaarn pe hai ab ye sun  agr ye sare adhar rke deatils ya tere persomsl detail agr khi aur kisi paper pe  hoge to iska koyii sence bnata hai nhi n to sun
// iska mtlb ye huva ki Adhar card pe hi adhaar card ki daitls achi lgegii aise hi real life example hai bohot daree


//fir ab dekh method bnaya to issme hme apna methode yni xstructure bnaya hai jha pe tumne usko as a methofd use kiye hoo smjhe jaise bachoo ki brawing ki book hoti hai
// usme sb bna hota hai bacha bs uspe pencil ya color krta aise hi samajh ki vo aur kuch nhi bs vhi hai 

// yha to main object call huyi hai mtlb hm object ko yha call krte ha after main() Student s = new Student (); 
// than we classs there data in this method for the emplemaintation thats is 
// after all we go with single line also  
// object hai jo uskkuch aise smjhoo jaise tum koyi tumhare aas paas phone pen paper and bottel hoga than ye sb
//  hoga ab ise kuch aise smjh tumhara phone tumhara hai ye object huva 
//  aur phone class huva 
// suno suno iski help se smjho :  Student s = new Student();   Student =>  kon si class hai mtlb ye
//  class hai jo question kr rhi hai for sure ki mai class hu kon si xclass 
// S =>  ye eek object hai jisko name diya gya hai we can change it also mtlb name diya hai object ko 
// new Student =>  ye btata hai ki nya object creat huva hai jo ki jiska name hai s also 
// for better nunderstanding jaise hmne do alg alg object bnayi hai vaise hi hm alg alg
//  object bnayi hai vaise hi Amit And Ashish dono alg alg student 
// hai inki alg alg deaitls hogi bhle classs eeek hii hoo 
// ye matter nhi krti they have there own different property many more things

//  for sure after doing this we call object here for the output s.intreoduce();  
// yha object call ho rha hai jaise for the shown there output of the entire code 