import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namnLista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int val;

        do {
            System.out.println("Välj en åtgärd:");
            System.out.println("1 - Skapa");
            System.out.println("2 - Radera");
            System.out.println("3 - Uppdatera");
            System.out.println("4 - Lista");
            System.out.println("5 - Avsluta");

            val = scanner.nextInt();

            switch (val) {
                case 1 -> {
                    System.out.println("Skriv in ett namn:");
                    String namn = scanner.next();
                    namnLista.add(namn);
                    System.out.println("Namnet har lagts till i listan.");
                }
                case 2 -> {
                    System.out.println("Skriv in ett namn att radera:");
                    String namnRadera = scanner.next();
                    if (namnLista.contains(namnRadera)) {
                        namnLista.remove(namnRadera);
                        System.out.println("Namnet har raderats från listan.");
                    } else {
                        System.out.println("Namnet finns inte i listan.");
                    }
                }
                case 3 -> {
                    System.out.println("Skriv in ett namn att uppdatera:");
                    String namnUppdatera = scanner.next();
                    if (namnLista.contains(namnUppdatera)) {
                        System.out.println("Skriv in ett ersättningsnamn:");
                        String ersattningsNamn = scanner.next();
                        namnLista.set(namnLista.indexOf(namnUppdatera), ersattningsNamn);
                        System.out.println("Namnet har uppdaterats i listan.");
                    } else {
                        System.out.println("Namnet finns inte i listan.");
                    }
                }
                case 4 -> {
                    if (namnLista.size() > 0) {
                        System.out.println("Namn i listan:");
                        for (String namnIListan : namnLista) {
                            System.out.println(namnIListan);
                        }
                    } else {
                        System.out.println("Listan är tom.");
                    }
                }
                case 5 -> System.out.println("Programmet avslutas.");
                default -> System.out.println("Ogiltigt val. Vänligen försök igen.");
            }
        } while (val != 5);
    }
}