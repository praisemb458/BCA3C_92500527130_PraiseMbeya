class Vehicle {
    int speed = 120;
    Vehicle() {
        System.out.println("Vehicle Constructor Called");
    }
    void main() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    int speed = 180;

    Car() {
        super();
    }

    void display() {
        System.out.println("Car Speed: " + speed);
        System.out.println("Parent Vehicle Speed: " + super.speed);
        super.run();
    }
}

public class velocity {
    public static void main(String args[]){

     Car c = new Car();

     c.display();
    }
}