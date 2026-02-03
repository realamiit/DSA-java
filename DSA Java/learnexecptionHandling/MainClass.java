public class MainClass {
    public static void main (String[] args){

        int a[] = new int[5];

        System.out.println(a[4]);

        System.out.println("Hello guyyy");

        try{
            System.out.println(a[7]);

            int result = 6/0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("i am exception jere right now");
            
//             we can put more (multipal) catch blocks 
        } catch(ArithmeticException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);           //here call auto toString() Calling


        }
        System.out.println("Byeee everyone");
  }


}

