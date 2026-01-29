public class LearnInnerClass {

    // public static void main(String[] args){
    //     LearnInnerClass obj = new LearnInnerClass();
    //     Toy toy = obj.new Toy();
    //     toy.price = 45; 

    //     PlayStation playstation =new LearnInnerClass.PlayStation();
    // }

    class Toy{
        int price;
    }

   static class PlayStation{
    int price;


    }
    public static void main(String[] args){
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 45; 

        PlayStation playstation =new LearnInnerClass.PlayStation();
    }

}
