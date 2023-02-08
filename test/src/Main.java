import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Välj en kategori");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        int category = input.nextInt();                                         //Tar emot val av kategori

        if (category == 1) {                                                    //Om det är val 1 då blir det Celsius
            System.out.println("Celsius");
            System.out.println("Väl en kategori");
            System.out.println("1. Celsius -> Fahrenheit");
            System.out.println("2. Celsius -> Kelvin");

            int conversion = input.nextInt();                                   //tar emot val av konvertering.

            if (conversion == 1) {                                              //Om konverteringen är val 1.
                System.out.println("Celsius -> Fahrenheit");
                System.out.println("Ange temperaturen i Celsius");              //förväntar oss en inmatning i decimal form.

                double celsius = input.nextDouble();                            //vi har fått en inmatning i decimal form.
                double fahrenheit = (celsius * 1.8) + 32;                       //1,8 gånger det värdet vi har fått från inmatningen och sendan plussar vi på 32.

                System.out.println(celsius + " °C = " + fahrenheit + " °F ");   //här skickar vi in svaret till konsulen efter vi har räknar dessa.
            }
            if (conversion == 2) {
                System.out.println("Celsius -> Kelvin");
                System.out.println("Ange temperaturen i Celsius");

                double celsius = input.nextDouble();
                double kelvin = celsius + 273.15;

                System.out.println(celsius + " °C = " + kelvin + " °K ");
            }
        }
        if (category == 2) {
            System.out.println("Fahrenheit");
            System.out.println("Välj en kategori");
            System.out.println("1. Fahrenheit -> Celsius");
            System.out.println("2. Fahrenheit -> Kelvin");

            int conversion = input.nextInt();

            if (conversion == 1) {
                System.out.println("Fahrenheit -> Celsius");
                System.out.println("Ange temperaturen i Fahrenheit");

                double fahrenheit = input.nextDouble();
                double celsius = (fahrenheit - 32) / 1.8;

                System.out.println(fahrenheit + " °F = " + celsius + " °C ");

            }
            if (conversion == 2) {
                System.out.println("Fahrenheit -> Kelvin");
                System.out.println("Ange temperaturen i Fahrenheit");

                double fahrenheit = input.nextDouble();
                double kelvin = (fahrenheit + 459.67) / 1.8;
                System.out.println(fahrenheit + " °F = " + kelvin + " °K ");
            }

        }

        if (category == 3) {
            System.out.println("Kelvin");
            System.out.println("Välj en kategori");
            System.out.println("1. Kelvin -> Celsius");
            System.out.println("2. Kelvin -> Fahrenheit");

            int conversion = input.nextInt();

            if (conversion == 1) {
                System.out.println("Kelvin -> Celsius");
                System.out.println("Ange temperaturen i Kelvin");

                double Kelvin = input.nextDouble();
                double celsius = (Kelvin - 273.15);

                System.out.println(Kelvin + " °K = " + celsius + " °C ");

            }
            if (conversion == 2) {
                System.out.println("Kelvin -> Fahrenheit");
                System.out.println("Ange temperaturen i Kelvin");

                double kelvin = input.nextDouble();
                double fahrenheit = kelvin * 1.8 - 459.67;
                System.out.println(kelvin + " °K = " + fahrenheit + " °F ");
            }

        }
    }

}