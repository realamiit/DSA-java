public class WrapperClass {
    public static void main(String[] args){

        Integer obj = Integer.valueOf(18); 

        Integer obj2 = Integer.valueOf(17); // ✅ correct

        Boolean myBoolean = Boolean.valueOf(false);

        Integer obj3 = 12;  // ✅ autoboxing

        int age = obj;   // ✅ unboxing
    }
}