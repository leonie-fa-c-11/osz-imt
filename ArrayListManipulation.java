import javax.xml.transform.stream.StreamSource;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListManipulation {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumberList = new ArrayList<>();
        for (int i=0; i<20; i++) {
            Random rand = new Random();
            int randInt = rand.nextInt(9) + 1;
            randomNumberList.add(randInt);
        }
        for(int i = 0; i < randomNumberList.size(); i++)
            System.out.printf("myList %2d : %3d\n", i, randomNumberList.get(i));

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Bitte gib eine Nummer zwischen 1 und 9 ein: ");
        int userNum = myScanner.nextInt();
        int counter = 0;
        ArrayList<Integer> userNumList = new ArrayList<>();
        for (int i = 0; i < randomNumberList.size(); i++){
            if (randomNumberList.get(i) == userNum){
                userNumList.add(i);
                counter++;
            }
        }
        System.out.println("Deine Nummer " + userNum + " kommt " + counter + " Mal in der Liste vor.");
        System.out.println("Deine Nummer " + userNum + " kommt an folgenden Indices vor: " + userNumList);

        randomNumberList.removeIf(num -> num == userNum);

        System.out.println("Liste nach der Löschung deiner Zahl: " + randomNumberList);

        for (int i = 0; i < randomNumberList.size(); i++){
            if (randomNumberList.get(i) == 5){
                randomNumberList.add(i+1, 0);
                i++; //damit die 0 die neu eingefügt wurde übersprungen wird
            }
        }

        System.out.println("So, jetzt ist nach jeder 5 eine 0. Das ist die Liste jetzt: " + randomNumberList);

    }
}
