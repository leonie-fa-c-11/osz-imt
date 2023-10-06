import java.util.ArrayList;
import java.util.Random;
public class ArrayListManipulation {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumberList = new ArrayList<Integer>();
        for (int i=0; i<20; i++){
            Random rand = new Random();
            int randInt = rand.nextInt(10);
            randomNumberList.add(randInt);
        }
        for (int num : randomNumberList){
            System.out.println(num);
        }
    }
}
