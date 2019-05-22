package OODBasics;

class Car implements VehicleActions {

    private int fuel;
    private int speed;

    Car() {
        fuel = 0;
        speed = 0;
    }

    @Override
    public void addFuel(int fuelVolume) {
        fuel += fuelVolume;
        System.out.println("Car adding " + fuelVolume + " more fuels, now having " + fuel);
    }

    @Override
    public void drive(int speed) {
        this.speed = speed;
        System.out.println("Car is driving at speed " + speed);
    }
}

class Bus implements VehicleActions {

    private int fuel;
    private int speed;

    Bus() {
        fuel = 0;
        speed = 0;
    }

    @Override
    public void addFuel(int fuelVolume) {
        fuel += fuelVolume;
        System.out.println("Bus " + fuelVolume + " more fuels, now having " + fuel);
    }

    @Override
    public void drive(int speed) {
        this.speed = speed;
        System.out.println("Bus is driving at speed " + speed);
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        InterfaceExample1 i = new InterfaceExample1();
        Car c = new Car();
        Bus b = new Bus();
        c.addFuel(20);
        c.drive(70);
        b.addFuel(30);
        b.drive(60);
    }
}
