package src.DSA.DSALearn.GenericsAndWrapperClasses.learnexecptionHandling;

public class MainClass {
    public static void main (String[] args){

        // int a[] = new int[5];
        int a[] = {44,55,66,77,44,44,33,33,32,65};

        System.out.println(a[8]);
        a[5] = 90;  // INDEX 5 PE ADD HOGA 44 to 90
        a[8] = 10;   // same here 
        System.out.println(a[5]);
        System.out.println(a[8]);

        System.out.println("Radha Radha ");

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

