public class MainClass {
    public static void main (String[] args){

        int a[] = new int[5];

        System.out.println(a[4]);

        System.out.println("Hello guyyy");

        try{
            System.out.println(a[7]);

            int result = 6/0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("i am execption jere right now");
            

        } catch(ArithmeticException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);

        }
        System.out.println("Byeee everyone");
  }


}

