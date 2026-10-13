package src.DSA.DSALearn.GenericsAndWrapperClasses.learnexecptionHandling;

public class MainClass {
    public static void main (String[] args){

        int a[] = new int[5];

        System.out.println(a[4]);

        System.out.println("Hello gaii");

        try{
            System.out.println(a[7]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("i am exception here right now");
            
//             we can put more (multipal) catch blocks 
        } catch(ArithmeticException n){
            System.out.println(n.getStackTrace());
            System.out.println(n.getMessage());
            System.out.println(n);      //here call auto toString() Calling


        }
        System.out.println("Byeee everyone");
  }


}

