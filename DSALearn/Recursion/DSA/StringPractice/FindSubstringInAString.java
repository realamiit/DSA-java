package StringPractice;

public class FindSubstringInAString  {
    public static void main(String[] args) {
        String s1 = "follobuilding.programamit";
        String s2 = "building.program";
        String s3 = "amit";

        if (s1.contains(s2)) {
            System.out.println("True");
        } else if (s1.contains(s3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}

// Check karta hai ki s2 continuous substring hai ya nahi
// meanst ye conferm krta hai ki s1 me s2 ,s3 ka substring hai ya nhi
// if substring hais2 ka to true nhi hai to bhi true because s3 hoga substring
// agr s3 bhi nhi hoga than also go with false
