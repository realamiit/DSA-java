package Day1;

public class Vehicle {
    String brand;
    int speed;

    void move() {
        System.out.println(brand + "Chal rhi hai ");
    }
}

class Bike extends Vehicle {
    void wheelie() {
        System.out.println(brand + "Chal rhi hai");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.brand = "Yamaha";
        b.speed = 120;
        b.move();
        b.wheelie();

    }

}
