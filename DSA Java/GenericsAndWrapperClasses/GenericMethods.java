public class GenericMethods {
    public static void main(String[]args){

        // here we take data
        // printData("Hello Im amit gupta");  //String
        printData(23445);                  //Integer    
        // printData(true);                   //Boolean 
        // printData(false);                  //Boolean 
        // printData("Amit");                  //String


         GenericMethods obj = new GenericMethods();
         obj.doubleData("Amit Gupta");
         obj.doubleData(12435);

         CustomClass custom = new CustomClass();
         obj.doubleData(custom);
    }

   

    static<E extends Number> void printData(E data){   //After (E) put this we can also Pass any type of DataType 
        System.out.println(data);
    }

    <E> void doubleData(E data){
        System.out.println(data);
    }

}

class CustomClass{

}
