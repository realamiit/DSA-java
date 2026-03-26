public class FinellyBlockInException {

    public static void main(String[]args){

        int a[] =  new int[5];
        System.out.println("Hello Varanasi");

        try{
            System.out.println(a[2]);
        }catch(Exception e){                    // this if u don't want to putin your
                                              //  programm thsn no nee to usee also
            System.out.println("Exception Handled");
        } finally{
            System.out.println("I will run always");
        }
        System.out.println("Beeeyeee World");
    }
}
