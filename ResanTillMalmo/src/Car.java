public class Car extends Vehicle {
    private int doors;

    
    public Car(String brand, String model, int speed, int year, int doors, double fuelConsumption) {
        super(brand, model, speed, year);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public double getFuelEfficiency() {
        int speed = getMaxSpeed();
        if (speed <= 60) {
            return 10.0;
        } else if (speed <= 80) {
            return 12.5;
        } else {
            return 15.0;
        }
    }

    public double getFuelConsumption(double distance) {
        return getFuelEfficiency() * distance / 100;
    }
}
