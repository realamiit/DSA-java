public class Student {

    // ye field hai class ke under and main ke bahr
    String Name;
    int rollNo;
    int marks;

    // ye method hai

    void introduce() {
        System.out.println("mera Name : " + Name + " , mera rollno : , " +rollNo + " , mera marks : , " + marks);
    }

    // main object class hai ye
    public static void main(String[] args) {
        Student s = new Student(); // object is here
        Student s1 = new Student();

        s.Name = "Amit"; // this is object
        s.rollNo = 22;
        s.marks = 78;

        s1.Name = "Ashish";
        s1.rollNo = 31;
        s1.marks = 82;

        s.introduce(); // here calling onject here
        s1.introduce();

    }
}

// ye upr jo class bhi field aur method main() se bahr object main() ye object
// ke under hota hai hamesha 
//pehele field bnaaya mtlb classs bnaya fir usme name , rollno and marks diya fir uske baad and haa rrmember
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

// after doing this we call object here for the output s.intreoduce();