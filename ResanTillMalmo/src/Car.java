public class Car extends Vehicle {
    private int doors;

        // Konstruktor tar emot parametrar för bilens egenskaper
    public Car(String brand, String model, int speed, int year, int doors, double fuelConsumption) {
        //anropar konstruktorn för att sätta värden för bilmärke, modell, hastighet och årsmodell
        super(brand, model, speed, year);
        // sparar värdet för antal dörrar i den privata variabeln "doors"
        this.doors = doors;
    }
    // en getmetod för att hämta värdet för antal dörrar
    public int getDoors() {
        return doors;
    }
    //överskriver superklassens metod för att beräkna bränsleelfektivitet baserat på hastighet.
    @Override
    public double getFuelEfficiency() {
        //hämtar hastigheten från superklassen
        int speed = getMaxSpeed();

        if (speed <= 60) { // om hastigheten är mindre än 60 så returneras 10.0
            return 10.0;    // om hastigheten är mindre än 80 så returneras 12.5
        } else if (speed <= 80) { // om hastigheten är mindre än 100 så returneras 15.0
            return 12.5; // om hastigheten är mer än 100 så returneras 15.0
        } else {    // om hastigheten är mer än 100 så returneras 15.0
            return 15.0; // om hastigheten är mer än 100 så returneras 15.0
        }
    }

    public double getFuelConsumption(double distance) { // beräknar bränsleförbrukning baserat på avstånd
        return getFuelEfficiency() * distance / 100; // returnerar bränsleförbrukning
    }
}
