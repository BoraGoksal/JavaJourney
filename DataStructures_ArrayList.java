import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataStructures_ArrayList {

    //Basic Operations with ArrayList (add,remove)
    public static void main(String[] args){
        //1.
        ArrayList<Integer> Numberlist = new ArrayList<>();
        addRemove(Numberlist,3);
        PrintNumbers(Numberlist);

        //2.
        String[] FruitArray = {"Banana", "Apple", "Strawberry", "Blackberry", "Watermelon"};
        ArrayList<String> FruitList = new ArrayList<>(Arrays.asList(FruitArray));
        String searchItem = "Apple";
        searchList(FruitList, searchItem);
    }
    //1. Basic Operations with ArrayList (adding and removing elements)
    static void addRemove(ArrayList<Integer> NumberList, int j){
        for(int i = 1; i <= 5; i++) {
            NumberList.add(i);
            if(j != -1 && NumberList.size() == 5){
                NumberList.remove(j);
            }
        }
    }
    //2. Searching in an ArrayList
    static void searchList(ArrayList<String> StringList, String searchItem){
            if(StringList.contains(searchItem)){
                System.out.println("The List contains:" + searchItem);
            } else {
                System.out.println("The List does NOT contain:" + searchItem);
            }
    }
    static void PrintNumbers(ArrayList<Integer> List){
        for(Integer i : List){
            System.out.println(i);
        }
    }
}
