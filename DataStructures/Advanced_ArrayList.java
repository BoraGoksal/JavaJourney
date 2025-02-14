package DataStructures;
import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Advanced_ArrayList {
    //Advanced Exercises with ArrayList
    public static void main(String[] args){
        // 1.Reversing an ArrayList
        ArrayList<Integer> Numbers=  new ArrayList<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);

        ReverseArrayList(Numbers);
        //2. Merging two sorted Arrays
        ArrayList<String> Words = new ArrayList<>();
        ArrayList<String> Words2 = new ArrayList<>();
        Words.add("Apple");
        Words.add("Orange");
        Words2.add("Watermelon");
        Words2.add("Pear");
        MergeArrays(Words,Words2);
    }

    public static void ReverseArrayList(ArrayList<Integer> numbers){
        for (int i = 0, j = numbers.size() - 1; i < j; i++, j--) {
            int temp = numbers.get(i);    // Step 1: Store the left element
            numbers.set(i, numbers.get(j)); // Step 2: Swap left with right
            numbers.set(j, temp);          // Step 3: Set right to stored left

        }
        System.out.println("Reversed List:" + numbers);
    }
    public static void MergeArrays(ArrayList<String> Words, ArrayList<String> Words2){
        Words.addAll(Words2);
        Collections.sort(Words);
        System.out.println(Words);
    }

    public static void MostFreqElement(ArrayList<Double> Numbers){
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();

        }

}

