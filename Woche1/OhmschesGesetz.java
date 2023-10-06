package Woche1;

import java.util.Scanner;
public class OhmschesGesetz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ohmsches Gesetz Berechnung");
        System.out.println("Wählen Sie die Größe, die Sie berechnen möchten:");
        System.out.println("R - Widerstand");
        System.out.println("U - Spannung");
        System.out.println("I - Stromstärke");

        char auswahl = scanner.next().charAt(0);

        double widerstand = 0.0;
        double spannung = 0.0;
        double stromstaerke = 0.0;

        switch (auswahl) {
            case 'R':
            case 'r':
                System.out.println("Geben Sie die Spannung (U) ein:");
                spannung = scanner.nextDouble();
                System.out.println("Geben Sie die Stromstärke (I) ein:");
                stromstaerke = scanner.nextDouble();
                widerstand = spannung / stromstaerke;
                System.out.println("Der Widerstand (R) beträgt: " + widerstand + " Ohm");
                break;

            case 'U':
            case 'u':
                System.out.println("Geben Sie den Widerstand (R) ein:");
                widerstand = scanner.nextDouble();
                System.out.println("Geben Sie die Stromstärke (I) ein:");
                stromstaerke = scanner.nextDouble();
                spannung = widerstand * stromstaerke;
                System.out.println("Die Spannung (U) beträgt: " + spannung + " Volt");
                break;

            case 'I':
            case 'i':
                System.out.println("Geben Sie den Widerstand (R) ein:");
                widerstand = scanner.nextDouble();
                System.out.println("Geben Sie die Spannung (U) ein:");
                spannung = scanner.nextDouble();
                stromstaerke = spannung / widerstand;
                System.out.println("Die Stromstärke (I) beträgt: " + stromstaerke + " Ampere");
                break;

            default:
                System.out.println("Falsche Eingabe! Bitte wählen Sie R, U oder I.");
                break;
        }
        scanner.close();
    }
}
