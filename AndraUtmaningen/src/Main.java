import java.util.Scanner;

//Du ska använda && (AND), || (OR), Continue, Break, If, For eller While
//
//        Du har en lista på 10 personer, med namn och ålder.
//        Du ska skriva ett program som går igenom listan med personer och skriver ut alla personer som uppfyller vissa kriterier.

//        1. Skriv ut alla personer som är under 20 år.
//        2. Skriv ut alla personer som är 20 år och alla som är under 30 år.
//        3. Skriv ut alla personer som är yngre än 20 år och alla som är äldre än 29 år.
//        4. Visa namn och ålder på äldsta och yngsta karaktären (1 av varje)
//        5. Visa en lista på alla personer som har jämna tal i sin ålder
//        6. Visa alla namn men stoppa körningen vid första person över 40 år.
//
//        För att skona dig från tråkdelen så får du en färdig lista här som exempel:
//
//        String[] namn = {"Elena Gilbert", "Stefan Salvatore", "Damon Salvatore", "Caroline Forbes",
//        "Bonnie Bennett", "Tyler Lockwood", "Matt Donovan", "Alaric Saltzman", "Klaus Mikaelson", "Rebekah Mikaelson"};
//        int[] ålder = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};

public class Main {
    public static void main(String[] args) {

        String[] name = {" Elena Gilbert ", " Stefan Salvatore ", " Damon Salvatore ", " Caroline Forbes ", " Bonnie Bennett ", " Tyler Lockwood ", " Matt Donovan ", " Alaric Saltzman ", " Klaus Mikaelson ", " Rebekah Mikaelson "};
        int[] age = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};

        System.out.println("Personer som är under 20 år");


        for (int i = 0; i < name.length; i++) {     //
            if (age[i] < 20) {
                System.out.println(name[i] + " " + age[i] + " år");
            }
        }
        System.out.println("----------------------------------------------");

        System.out.println("personer mellan 20 och 30");

        for (int i = 0; i < name.length; i++) {
            if (age[i] >= 20 && age[i] < 30) {
                System.out.println(name[i] + " " + age[i] + " år");
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("personer yngre än 20 eller äldre än 29");

        for (int i = 0; i < name.length; i++) {
            if (age[i] < 20 || age[i] > 29) {
                System.out.println(name[i] + " " + age[i] + " år");
            }
        }

        System.out.println("----------------------------------------------");

        int oldestAge = Integer.MIN_VALUE;
        int youngestAge = Integer.MAX_VALUE;
        System.out.println("Äldsta och yngsta personerna:");
        for (int i = 0; i < name.length; i++) {
            if (age[i] > oldestAge) {
                oldestAge = age[i];
            }
            if (age[i] < youngestAge) {
                youngestAge = age[i];
            }
        }
        for (int i = 0; i < name.length; i++) {
            if (age[i] == oldestAge) {
                System.out.println("Äldsta personen är" + name[i] + oldestAge + " år");
            }
            if (age[i] == youngestAge) {
                System.out.println("Yngsta personen är" + name[i] + youngestAge + " år");
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Personer med jämnt antal år:");
        for (int i = 0; i < name.length; i++) {
            if (age[i] % 2 == 0) {
                System.out.println(name[i] + "" + age[i] + " år");
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Personer under 40 år:");

        for (int i = 0; i < name.length; i++) {     //
            if (age[i] < 40) {
                System.out.println(name[i] + " " + age[i] + " år");

            }

        }
        {

        }
    }
}