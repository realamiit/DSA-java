public class FindSubstringInAString {
    public static void main(String[] args) {
        String s1 = "follobuilding.programamit";
        String s2 = "building.program";

        if(s1.contains(s2)){   //Check karta hai ki s2 continuous substring hai ya nahi
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }

}
