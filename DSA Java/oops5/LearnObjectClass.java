
 class Car{
        String model;
        int year;

        public Car(String model , int year){
            this.model = model;
            this.year = year;
        }


         @Override
        public String toString(){
            return "Car ka model = "+model+" and year is = "+year;

        }

        @Override
        public int hashCode(){
            int initialNumber = 31;
            initialNumber += year;
            initialNumber  += model.hashCode();
            return initialNumber;
        }

        // public boolean equals(Object obj){
        //     Car that = (Car)obj;
        //     if(this.model.equals(that.model) && this.year == that.year){
        //         return true;
        //     }
        //     return false;

        // }
        
       
    }
public class LearnObjectClass {
    public static void main(String[]args){
        Car obj1 =new Car("Honda", 2022);
        Car obj2 =new Car("Honda", 2026);       //its return true because year != year


        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
   

}
