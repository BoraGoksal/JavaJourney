import java.util.*;


public class DataStructures_ArrayList {

    //Basic Operations with ArrayList (add,remove)
    public static void main(String[] args){
        //1.
        ArrayList<Integer> Numberlist = new ArrayList<>();
        AddRemove(Numberlist,3);
        PrintNumbers(Numberlist);

        //2. Search Array (Contains())
        String[] FruitArray = {"Banana", "Apple", "Strawberry", "Blackberry", "Watermelon"};
        ArrayList<String> FruitList = new ArrayList<>(Arrays.asList(FruitArray));
        String searchItem = "Apple";
        SearchArrayList(FruitList, searchItem);

        //3. Sorted Array (Collections.sort())
        ArrayList<String> Words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        SortArrayList(Words, scanner);

        //4. Remove Duplicates(Hashset<>,Clear(),addAll())
        ArrayList<Integer> duplicateNums = new ArrayList<>();
        duplicateNums.add(50);
        duplicateNums.add(20);
        duplicateNums.add(30);
        duplicateNums.add(20);
        duplicateNums.add(35);
        duplicateNums.add(35);
        RemoveDuplicate(duplicateNums);
    }
    //1. Basic Operations with ArrayList (adding and removing elements)
    public static void AddRemove(ArrayList<Integer> NumberList, int j){
        for(int i = 1; i <= 4; i++) {
            NumberList.add(i);
            if(j != -1 && NumberList.size() == 5){
                NumberList.remove(j);
            }
        }
    }
    //2. Searching in an ArrayList
    public static void SearchArrayList(ArrayList<String> StringList, String searchItem){
            if(StringList.contains(searchItem)){
                System.out.println("The List contains:" + searchItem);
            } else {
                System.out.println("The List does NOT contain:" + searchItem);
            }
    }
    public static void PrintNumbers(ArrayList<Integer> List){
        for(Integer i : List){
            System.out.println(i);
        }
    }
    public static void SortArrayList(ArrayList<String> List, Scanner scanner){
        System.out.println("Type 5 words:");
        for(int i = 0; i < 5; i++){
            List.add(scanner.nextLine());
        }
        Collections.sort(List);
        System.out.println("Sorted List: " + List);
    }
    public static void RemoveDuplicate(ArrayList<Integer> List){
        //Hashsets don't allow duplicates and has O(1) time complexity
        HashSet<Integer> uniqueNumbers = new HashSet<>(List);
        List.clear();
        List.addAll(uniqueNumbers);
        Collections.sort(List);
        System.out.println("List after removing duplicates and sorting: " + List);
    }
}
