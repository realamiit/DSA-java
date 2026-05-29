public class LearnInterfaces {
    // Animal a1 = new Animal();    //it cant accesss here we can only access child class like niche access hai

    public static void main(String[] args){
        Cat cat =new Cat();
        cat.eats();
        cat.run();
        cat.sings();
        cat.drinks();
        cat.Sleep();


        System.out.println("She have"+" "+Animal.Legs+" "+"Legs");
    } 
}

interface Pet{
    void sings();
    void drinks();
}

interface Animal{

  void eats();
  void run();
  void drinks();

  int Legs = 4;

  default void Sleep(){

    System.out.println("Animal is Sleeping");
  }

}

class Cat implements Animal ,Pet{

    @Override
    public void eats(){
        System.out.println("Cat takes food right now");
    }

    @Override
    public void run(){
        System.out.println("Cat is runing on the Flore Myu myUUU myUUU ^<!>^");
    }

    @Override
    public void sings(){
        System.out.println("Cat Sing a Song mai hu CAt mai gati hu myauu myauuu muyaaa");
    }
    @Override
    public void drinks(){
    System.out.println("Cat Drinks Milk and again she sinng a song myaauuu myau mmyaaaaau");
    }
}



//      Here is the putput of the entire code 

// Cat takes food right now
// Cat is runing on the Flore Myu myUUU myUUU ^<!>^
// Cat Sing a Song mai hu CAt mai gati hu myauu myauuu muyaaa
// Cat Drinks Milk and again she sinng a song myaauuu myau mmyaaaaau  
// Animal is Sleeping
// She have 4 Legs
