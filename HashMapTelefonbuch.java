import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTelefonbuch {
    public static void main(String[] args) {
        Map<String, String> telefonbuch = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Telefonbuch-Optionen:");
            System.out.println("[a] Kontakt hinzufügen");
            System.out.println("[b] Kontakt löschen");
            System.out.println("[c] Kontakt überschreiben");
            System.out.println("[d] Abfrage");
            System.out.println("[e] Auslesen");
            System.out.println("[f] Alle Einträge auslesen");
            System.out.println("[g] Alle Einträge löschen");
            System.out.println("[x] Telefonbuch beenden");

            String option = scanner.next();
            scanner.nextLine();
            switch (option) {
                case "a":
                    System.out.print("Geben Sie den Namen des Kontakts ein: ");
                    String name = scanner.nextLine();
                    System.out.print("Geben Sie die Telefonnummer des Kontakts ein: ");
                    String telefonnummer = scanner.nextLine();
                    telefonbuch.put(name, telefonnummer);
                    System.out.println(name + " wurde zum Telefonbuch hinzugefügt.");
                    break;
                case "b":
                    System.out.print("Welchen Kontakt wollen Sie löschen?");
                    break;
                case "c":

                    break;
                case "d":
                    break;
                case "e":

                case "f":
                case "g":

                case "x":
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Ungültige Option. Bitte wählen Sie eine gültige Option (1-4).");
            }
        }
    }
}
