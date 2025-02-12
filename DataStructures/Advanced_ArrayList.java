package DataStructures;
import java.util.ArrayList;

public class Advanced_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> Numbers=  new ArrayList<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);

        ReverseArrayList(Numbers);
    }

    public static void ReverseArrayList(ArrayList<Integer> numbers){
        for (int i = 0, j = numbers.size() - 1; i < j; i++, j--) {
            int temp = numbers.get(i);    // Step 1: Store the left element
            numbers.set(i, numbers.get(j)); // Step 2: Swap left with right
            numbers.set(j, temp);          // Step 3: Set right to stored left

        }
        System.out.println("Reversed List:" + numbers);
    }
}
