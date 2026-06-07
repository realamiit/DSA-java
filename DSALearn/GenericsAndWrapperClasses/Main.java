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
        Human H1 = new Human(101);
        Human H2 = new Human(202);

        System.out.println(H1.getId());
        System.out.println(H2.getId());
    }
}