package src.DSA.DSALearn.GenericsAndWrapperClasses.learnexecptionHandling;

public class ExecptionHandling {

    public static void main(String[]args){

        int a[] =  new int[5];
        System.out.println("Hello Varanasi");
        System.out.println("Hello Greater Noida!!");

        try{
            System.out.println(a[2]);
        }catch(Exception e){                    // this if u don't want to putin your programm then no need to use also
            System.out.println("Exception Handled");
        } finally{
            System.out.println("I will run always");
        }
        System.out.println("Beeeyeee World");
    }
}

/*
    The Output is:

Hello Varanasi
Hello Greater Noida!!
0
I will run always
Beeeyeee World
*/
