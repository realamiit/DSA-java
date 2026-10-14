package src.DSA.DSALearn.GenericsAndWrapperClasses;
class Human {
    private int id;

    public Human(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        Human Hum1 = new Human(109);
        Human Hum2 = new Human(202);

        System.out.println(Hum1.getId());
        System.out.println(Hum2.getId());
    }
}