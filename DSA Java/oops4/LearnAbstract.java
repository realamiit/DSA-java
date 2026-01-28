public class LearnAbstract {

    public static void main (String[]arg){
        // vhicle v1 =new evhicle();

        Car c1 =  new Car();
        c1.accelerate();
        c1.breaks(4);
        c1.honks();
    }
}

//   for ecample even we make single one Abstract class than  we have to make those class makes abstract also 

//  abstract class Human{
//     void speaks(){
//     }
//      abstract void eat();
// }

abstract class Vehicle{     //we cant use direct beacuse abstract class can't be access directly only we can use child class only in abstract class


abstract void accelerate();
abstract int breaks(int wheels);

void honks(){
     System.out.println("Vehicle honks");
}

}

class Scooter extends Vehicle{
    @Override
    void accelerate(){


    }

    @Override
    int breaks(int wheels){
        return 0;
    }
}
class Car extends Vehicle{

    @Override           // this is called annotation no matter we use or not it depend on me 
    void accelerate(){
        System.out.println(" Car is Accelerate");

    }
    
    // @Override            // it cheaksno misteak in class name actualy
    int breaks(int wheels){
         System.out.println("Car breaks are puched");
        return wheels;

    }
    void honks(){
         System.out.println("Car is honks");
    }
}



//       output=>


// Car is Accelerate
// Car breaks are puched
// Car is honks