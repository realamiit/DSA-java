public class LearnInnerClass {

    // public static void main(String[] args){
    //     LearnInnerClass obj = new LearnInnerClass();
    //     Toy toy = obj.new Toy();
    //     toy.price = 45; 

    //     PlayStation playstation =new LearnInnerClass.PlayStation();
    // }


    // *******************Another Aproch ********************* 

//     class Toy{
//         int price;
//     }

//    static class PlayStation{
//     int price;


//     }
//     public static void main(String[] args){
//         LearnInnerClass obj = new LearnInnerClass();
//         Toy toy = obj.new Toy();
//         toy.price = 45; 

//         PlayStation playstation =new LearnInnerClass.PlayStation();
//     }

// }



    class Toy {
        int price;
    }

    static class PlayStation {
        int price;
    }

    public static void main(String[] args){

        LearnInnerClass obj = new LearnInnerClass();

        // Inner class object
        LearnInnerClass.Toy toy = obj.new Toy();
        toy.price = 45;

        // Static nested class object
        LearnInnerClass.PlayStation ps = new LearnInnerClass.PlayStation();
        ps.price = 50000;

        System.out.println("Toy price: " + toy.price);
        System.out.println("PlayStation price: " + ps.price);
    }
}