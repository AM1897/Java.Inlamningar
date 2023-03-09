abstract class Vehicle {
    private String name;
    private double fuelEfficiency;

    public Vehicle(String name, double fuelEfficiency) {
        this.name = name;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getName() {
        return name;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double calculateFuelCost(double distance, double fuelPrice) {
        double fuelConsumpation = distance / fuelEfficiency;
        return fuelConsumpation * fuelPrice;
    }
}
