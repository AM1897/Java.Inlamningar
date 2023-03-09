public class Main {
    public static void main(String[] args) {
        double distance = 286; // km from Göteborg till Malmö
        double fuelPrice = 16; // SEK per liter

        Car car = new Car();
        double carCost = car.calculateFuelCost(distance, fuelPrice);
        System.out.println("Det kostar " + carCost + " SEK att bila från Göteborg till Malmö.");

        Truck truck = new Truck();
        double truckCost = truck.calculateFuelCost(distance, fuelPrice);
        System.out.println("Det kostar " + truckCost + " SEK att åka lastbil från Göteborg till Malmö.");

        Motorcycle motorcycle = new Motorcycle();
        double motorcycleCost = motorcycle.calculateFuelCost(distance, fuelPrice);
        System.out.println("Det kostar " + motorcycleCost + " SEK att åka från Göteborg till Malmö med motorcykel." );

        double cheapestCost = Math.min(carCost, Math.min(truckCost, motorcycleCost));
        String cheapestVehicle;

        if (cheapestCost == carCost) {
            cheapestVehicle = " bil";
        } else if (cheapestCost == truckCost) {
            cheapestVehicle = " Lastbil";
        } else {
            cheapestVehicle = " Motorcykel";
        }

    System.out.println("Den billigaste fordon att åka från Göteborg till Malmö är:" + cheapestVehicle + " Och den kommer att kosta" + cheapestCost + " SEK");
    }
}