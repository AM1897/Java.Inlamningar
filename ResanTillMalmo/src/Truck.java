public class Truck extends Vehicle {
    private int doors;
    private int capacity;

    public Truck(String brand, String model, int speed, int year, int doors, int capacity, double fuelConsumption) {
        super(brand, model, speed, year);
        this.doors = doors;
        this.capacity = capacity;
    }

    public int getDoors() {
        return doors;
    }

    public int getCapacity() {
        return capacity;
    }
     
    @Override
    public double getFuelEfficiency() {
        int speed = getMaxSpeed();
        if (speed <= 60) {
            return 25.0;
        } else if (speed <= 80) {
            return 30.0;
        } else {
            return 35.0;
        }
    }

    public double getFuelConsumption(double distance) {
        return getFuelEfficiency() * distance / 100;
    }
}
