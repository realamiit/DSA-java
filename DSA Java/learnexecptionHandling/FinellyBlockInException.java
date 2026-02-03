public class FinellyBlockInException {

    public static void main(String[]args){

        int a[] =  new int[5];
        System.out.println("Hello Varanasi");

        try{
            System.out.println(a[8]);
        }catch(Exception e){
            System.out.println("Exception Handled");
        } finally{
            System.out.println("I will run always");
        }
        System.out.println("Beee World");
    }
}
