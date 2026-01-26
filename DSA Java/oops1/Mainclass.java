public class Mainclass {
     public static void main(String[] args) {

        int age =18;
        Dog d1 = new Dog();

        d1.color = "red";
        d1.name = "Bunny";
        d1.walk();

        Dog d2 = new Dog();
        d2.color = "green";
        d2.name = "leo";
        d2.bark();

    }
}

//  in one public class we cant create like this many more classes
class Cat{                   //class1

}
class Dog{                 //class2  (Factory)
    String name;
    int age ;
    String color;

    void eat(){
        System.out.println(name+" is eating");

    }
    void sleep(){
        System.out.println(name + "is sleeping");
    }

    void walk(){
        System.out.println(name  + "is walking");
    }
    void bark(){
        System.out.println(name + "is barking");
    }
}


class Animal{             //class3
}

