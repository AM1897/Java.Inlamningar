public class Motorcycle extends Vehicle {
    private boolean windShield;

    public Motorcycle(String brand, String model, int speed, int year, boolean windShield, double fuelConsumption) {
        super(brand, model, speed, year);
        this.windShield = windShield;
    }

    public boolean hasWindShield() {
        return windShield;
    }

    @Override
    public double getFuelEfficiency() {
        int speed = getMaxSpeed();
        if (speed <= 60) {
            return 3.0;
        } else if (speed <= 80) {
            return 4.0;
        } else {
            return 5.0;
        }
    }

    public double getFuelConsumption(double distance) {
        return getFuelEfficiency() * distance / 100;
    }
}
