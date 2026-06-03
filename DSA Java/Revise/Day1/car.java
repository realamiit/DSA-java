package Day1;

public class Car {
    String brand;
    String color;
    int speed;

    Car(String Brand, String Color, int Speed) {
        this.brand = Brand;
        this.color = Color;
        this.speed = Speed;
    }

    void details() {
        System.out.println("Brand : " + brand + "Color : " + color + "Speeed : " + speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Maruti", "Red", 120);
        Car c2 = new Car("Honda", "Brown", 130);

        c1.details();
        c2.details();

    }

}
