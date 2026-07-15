package DSA.Day1;

public class Animal {

    String name = "Animal";

    void eat() {
        System.out.println("Animal kha rha hai");
    }

}

class Dog extends Animal {
    String name = "Dog";

    void show() {
        System.out.println(name);
        System.out.println(super.name);
        super.eat();

    }
}

class Elephant extends Animal {
    String name = "Elephant";

    void show() {
        System.out.println(name);
        System.out.println(super.name);
        super.eat();
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();

        Elephant e = new Elephant();
        e.show();
    }
}

// main super ko use kiya aur name Animal void eat bnaya uske und "Animal kha
// rha hai "
// prin krwaya this is the features we can exttend by the using super key word
// class Dog Extend Animal ko extends Animal fir
// usme String name bnaya dog name ka fir usme viud show variable bnaya priint
// krwaya
// name print krwaya and fir again Super.name call kiya fir inme Supern.eat();

// main me Dog d = new Dog();
// d.show();
// bnaya upr se show ko call kiya useme fir call huva void show(); ko call kiya
// name ,
// super.name , super.eat();

// tha after call this we get the output is :
// Dog
// Animal
// Animal kha rha hai

// 🎯 DSA SHURU — RECURSION!
// Kal fresh mind se aana — aaj notebook mein sirf itna likh:
// Recursion = function jo khud ko call kare
// Base case = jahan rok do
// Recursive case = chota karte jao
// Kal seedha code karenge — koi theory nahi, seedha problems! 🚀
// Aaj ke liye DONE! Rest karo! 😄