package Day1;

public class Animal {

    String name = "Animal";

    void eat() {
        System.out.println("Animal kha rha hai");
    }

}

class Dog extends Animal {
    String name = "Dog";

    void show() {
        
        super.eat();

    }
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}


// main super ko use kiya 