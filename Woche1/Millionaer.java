package Woche1;

import java.util.Scanner;

public class Millionaer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Berechnung, wann Sie Millionär werden");
        System.out.print("Einmalige Anlagesumme (in €): ");
        double anlagesumme = scanner.nextDouble();
        System.out.print("Jährlicher Zinssatz (%): ");
        double zinssatz = scanner.nextDouble() / 100.0;

        double zielkapital = 1000000.0;
        int jahre = 0;

        while (anlagesumme < zielkapital) {
            anlagesumme *= (1 + zinssatz);
            jahre++;
        }

        System.out.println("Sie werden nach " + jahre + " Jahren Millionär.");

        scanner.close();
    }
}
