package Day1;

public class Vehicle {
    String brand;
    int speed;

    void move() {
        System.out.println(brand + " Chal rhi hai ");
    }
}

class Bike extends Vehicle {
    void wheelie() {
        System.out.println(brand + " Chal rhi hai");
    }

    public static void main(String[] args) {
        Bike b = new Bike();{}
        b.brand = "Yamaha";
        b.speed = 120;
        b.move();
        b.wheelie();
    }

}

// vehicle class bnanaya fir usme brand, speed, move() method banaya fir 
// bike extends vehicle se ya inherit kiya taki iske function aaye 
// aona wheelie() method me  main ko object banake  dono method ko call kiya mtlb 
// b.move();  b.wheelie(); method ko call kiya to output milaa :
// YamahaChal rhi hai gadi
// YamahaChal rhi hai