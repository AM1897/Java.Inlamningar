abstract class Vehicle {  
    // Instansvariabler      
    private String brand;   // bilens märke
    private String model;   // bilens modell
    private int speed;      // bilens hastighet
    private int year;       // bilens årsmodell

    // Konstruktor tar emot parametrar för bilens egenskaper
    public Vehicle(String brand, String model, int speed, int year) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }

    // en annan konstruktor som inte har någon implementation
    public Vehicle(String brand2, String model2, int speed2, int year2, double fuelEfficiency) {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    
    }
    
    public int getMaxSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }
    // Abstrakt metod för att hämta bränsleelfektivitet
    public abstract double getFuelEfficiency();
    // användas för att hämta bränsleförbrukningen för ett fordon, baserat på avståndet som det fordonet kommer att resa
    public abstract double getFuelConsumption(double distance);

    
}
