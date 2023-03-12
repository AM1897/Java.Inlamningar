public class Main {

    public static void main(String[] args) {
        //Deklarera variabler för avstånd och bränslepris
        double distance = 200;      // km fråm Göteborg till Malmö
        double fuelPrice = 19.42;   // pris på bränsle per liter

        // Skriv ut avstånd och bränslepris
        System.out.println("Att resa till Malmö är " + distance + " km: ");
        System.out.println("Bärnsle priset " + fuelPrice + " SEK");
        System.out.println();

        // skapa en instans av klassen "Car" med hjälp av konstruktorn
        Car car = new Car("BMW ", "M5 ", 260, 2022,  4, 10.0);
        // hämta bilens bränsleförbrukning med hjälp av "getFuelEfficiency" metoden
        double carFuelEfficiency = car.getFuelEfficiency(); 
        // beräkna bränslens förbrukning för resan till Malmö
        double carFuelConsumption = carFuelEfficiency * distance / 100;
        // beräkna kostnaden för bränslet för resan till Malmö
        double carFuelCost = carFuelConsumption * fuelPrice;
    

        // bilens egenskaper och bränsleförbrukning och kostnad för resan till Malmö
        System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear()+ "");
        System.out.println("Högsta hatighet " + car.getMaxSpeed()+ " km/h");
        System.out.println("Bränsleförbrukning " + car.getFuelEfficiency() + " per 100 km");
        System.out.println("Antal dörrar " + car.getDoors());
        System.out.println("Bränsle som behövs till Malmö är " + carFuelConsumption + " Liter");
        System.out.println("Pris på bränsle för hela resan är " + carFuelCost + " SEK");
        System.out.println();



        Motorcycle motorcycle = new Motorcycle("Yamaha ", "MT-07 ", 310, 2019, false, 4.5 );
        double motorcycleFuelEfficiency = motorcycle.getFuelEfficiency();
        double motorcycleFuelConsumption = motorcycleFuelEfficiency * distance / 100;
        double motorcycleFuelCost = motorcycleFuelConsumption * fuelPrice;

        System.out.println(motorcycle.getBrand() + " " + motorcycle.getModel() + " (" + motorcycle.getYear() + ")");
        System.out.println("Högsta hatighet " + motorcycle.getMaxSpeed() + " km/h");
        System.out.println("Bränsleförbrukning " + motorcycleFuelEfficiency + " per 100 km");
        System.out.println("Antal dörrar " + motorcycle.hasWindShield());
        System.out.println("Bränsle som behövs till Malmö är " + motorcycleFuelConsumption + " Liter");
        System.out.println("Pris på bränsle för hela resan är " + motorcycleFuelCost + " SEK");
        System.out.println();



        Truck truck = new Truck("Mercedes-Benz ", "Actros ", 110, 2015, 2, 80, 36.0);
        double truckFuelEfficiency = truck.getFuelEfficiency();
        double truckFuelConsumption = truckFuelEfficiency * distance / 100;
        double truckFuelCost = truckFuelConsumption * fuelPrice;

        System.out.println(truck.getBrand() + " " + truck.getModel() + " (" + truck.getYear() + ")");
        System.out.println("Högsta hatighet " + truck.getMaxSpeed() + " km/h");
        System.out.println("Bränsleförbrukning " + truckFuelEfficiency + " l/100 km");
        System.out.println("Antal dörrar " + truck.getDoors());
        System.out.println("Kapacitet " + truck.getCapacity() + " ton");
        System.out.println("Bränsle som behövs till Malmö är " + truckFuelConsumption + " l");
        System.out.println("Pris på bränsle för hela resan är " + truckFuelCost + " kr");
        System.out.println();


        // Vi använder oss av MAX_VALUE för att säkerställa att vi får ett värde som är lägre än alla andra. här hämförs det lägsta värdet med högsta värdet. då tar den ut den lägsta värdet.
        double cheapestCost = Double.MAX_VALUE;
        String cheapestVehicle = "";        // skapar variabel för att spara det billigaste fordonet
        // jämför bränslekostnaden för bilen med det lägsta bränslekostnaden hittills.
        if (carFuelCost < cheapestCost) {
            cheapestCost = carFuelCost;
            cheapestVehicle = car.getBrand() + " " + car.getModel() + " (" + car.getYear() + ")";
        }
        // jämför bränslekostnaden för motorcykeln med det lägsta bränslekostnaden hittills.
        if (motorcycleFuelCost < cheapestCost) {
            cheapestCost = motorcycleFuelCost;
            cheapestVehicle = motorcycle.getBrand() + " " + motorcycle.getModel() + " (" + motorcycle.getYear() + ")";
        }
        // jämför bränslekostnaden för lastbilen med det lägsta bränslekostnaden hittills.
        if (truckFuelCost < cheapestCost) {
            cheapestCost = truckFuelCost;
            cheapestVehicle = truck.getBrand() + " " + truck.getModel() + " (" + truck.getYear() + ")";
        }
        // skriv ut det billigaste bränsle priset och fordonet.
        System.out.println(cheapestVehicle + " är billigast, och det kommer att kosta " + cheapestCost + " SEK.");
    }
}
    