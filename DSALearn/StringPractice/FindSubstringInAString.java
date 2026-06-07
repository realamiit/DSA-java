public class FindSubstringInAString {
    public static void main(String[] args) {
//  it means substring is Avilable on String also than the output is true than Flass ()no
        String s1 = "follobuilding.programamit";
        String s2 = "building.program";

        if(s1.contains(s2)){   //Check karta hai ki s2 continuous substring hai ya nahi
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
