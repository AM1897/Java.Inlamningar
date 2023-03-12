public class Main {

    public static void main(String[] args) {
        double distance = 200; // km fråm Göteborg till Malmö
        double fuelPrice = 19.42; // pris på bränsle per liter

        System.out.println("Att resa till Malmö är " + distance + " km: ");
        System.out.println("Bärnsle priset " + fuelPrice + " SEK");
        System.out.println();


        Car car = new Car("BMW ", "M5 ", 260, 2022,  4, 10.0);
        double carFuelEfficiency = car.getFuelEfficiency();
        double carFuelConsumption = carFuelEfficiency * distance / 100;
        double carFuelCost = carFuelConsumption * fuelPrice;
    


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



        double cheapestCost = Double.MAX_VALUE;
        String cheapestVehicle = "";
        if (carFuelCost < cheapestCost) {
            cheapestCost = carFuelCost;
            cheapestVehicle = car.getBrand() + " " + car.getModel() + " (" + car.getYear() + ")";
        }
        if (motorcycleFuelCost < cheapestCost) {
            cheapestCost = motorcycleFuelCost;
            cheapestVehicle = motorcycle.getBrand() + " " + motorcycle.getModel() + " (" + motorcycle.getYear() + ")";
        }
        if (truckFuelCost < cheapestCost) {
            cheapestCost = truckFuelCost;
            cheapestVehicle = truck.getBrand() + " " + truck.getModel() + " (" + truck.getYear() + ")";
        }

        System.out.println(cheapestVehicle + " är billigast, och det kommer att kosta " + cheapestCost + " SEK.");
    }
}
    