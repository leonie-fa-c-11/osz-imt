import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTelefonbuch {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
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
                    String phoneNumber = scanner.nextLine();
                    phoneBook.put(name, phoneNumber);
                    System.out.println(name + " wurde zum Telefonbuch hinzugefügt.");
                    break;
                case "b":
                    System.out.print("Welchen Kontakt wollen Sie löschen?");
                    String contactToDelete = scanner.nextLine();
                    if (phoneBook.containsKey(contactToDelete)){
                        phoneBook.remove(contactToDelete);
                        System.out.println("Der Kontakt wurde gelöscht.");
                    }
                    else {
                        System.out.println("Diesen Kontakt gibt es leider nicht.");
                    }
                    break;
                case "c":
                    System.out.println("Welchen Kontakt wollen Sie überschreiben?");
                    String contactToOverwrite = scanner.nextLine();
                    if (phoneBook.containsKey(contactToOverwrite)){
                        System.out.println("Bitte geben Sie die neue Nummer des Kontakts ein:");
                        String newPhoneNumber = scanner.nextLine();
                        phoneBook.put(contactToOverwrite, newPhoneNumber);
                        System.out.println("Die Nummer wurde überschrieben.");
                    }
                    else {
                        System.out.println("Diesen Kontakt gibt es leider nicht.");
                    }
                    break;
                case "d":
                    System.out.println("Wollen Sie einen Name oder eine Nummer abfragen? Für Name mit 1 eingeben und für Nummer bitte 2 eingeben;");
                    int userInputNum = scanner.nextInt();
                    if (userInputNum == 1){
                        System.out.println("Name abfragen. Bitte den Name eingeben: ");
                        scanner.nextLine();
                        String searchName = scanner.nextLine();
                        if(phoneBook.containsKey(searchName)){
                            System.out.println(phoneBook.get(searchName));
                        }
                        else{
                            System.out.println("Name nicht vorhanden");
                        }
                    }
                    else if(userInputNum == 2){
                        System.out.println("Nummer abfragen. Bitte die Nummer eingeben: ");
                        scanner.nextLine();
                        String searchNum = scanner.nextLine();
                        if (phoneBook.containsValue(searchNum)){
                            System.out.println(phoneBook.get(searchNum));
                        }
                        else {
                            System.out.println("Nummer nicht vorhanden");
                        }
                    }
                    break;
                case "e":
                    System.out.println("Willkommen zum Auslesen. Geben Sie einen Namen ein: ");
                    String readName = scanner.nextLine();
                    if(phoneBook.containsKey(readName)){
                        System.out.println(phoneBook.get(readName));
                    }
                    else{
                        System.out.println("Name nicht vorhanden");
                    }
                case "f":
                    System.out.println("Hier ist das gesamte Telefonbuch:");
                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                        String allName = entry.getKey();
                        String allNumber = entry.getValue();
                        System.out.println(allName + ": " + allNumber);
                    }
                    break;
                case "g":
                    System.out.println("Sind Sie sicher, dass sie alles löschen wollen? y/n");
                    String sure = scanner.nextLine();
                    if (sure.equals("y")){
                        phoneBook.clear();
                    }
                    else if (sure.equals("n")){
                       System.out.println("Sie sind sich nicht sicher. Das ist ok.");
                    }
                    break;
                case "x":
                    System.out.println("Auf Wiedersehen!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Falsche Eingabe. Bitte ein Buchstabe von a-g oder x in Kleinschreibung");
            }
        }
    }
}
