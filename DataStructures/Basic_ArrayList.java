package DataStructures;

import java.util.*;

public class Basic_ArrayList {

    //Basic Exercises with ArrayList
    public static void main(String[] args){
        //1.
        ArrayList<Integer> Numberlist = new ArrayList<>();
        Numberlist.add(1); //adding integer value to Numberlist
        Numberlist.add(2);
        Numberlist.add(3);
        Numberlist.add(4);
        Numberlist.add(5);
        RemoveElement(Numberlist,3);

        //2. Search Array (Contains())
        String[] FruitArray = {"Banana", "Apple", "Strawberry", "Blackberry", "Watermelon"};
        ArrayList<String> FruitList = new ArrayList<>(Arrays.asList(FruitArray));    //converting Array to ArrayList
        String searchItem = "Apple";
        SearchArrayList(FruitList, searchItem); //checking if ArrayList contains Apple

        //3. Sorted Array (Collections.sort())
        ArrayList<String> Words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); //User input
        SortArrayList(Words, scanner); //converting input strings into an ArrayList

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
    public static void RemoveElement(ArrayList<Integer> NumberList, int j){
            if(j != -1){ // setting special character -1 to j to only add numbers if necessary
            NumberList.remove(j);  // if j is not -1 then Remove a specified element

                System.out.println("After removing the value at index " + j + ", the list contains:" + NumberList );
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
        List.clear(); //clearing original List
        List.addAll(uniqueNumbers); // adding unique values from Hashset to ArrayList
        Collections.sort(List); //sorting ArrayList
        System.out.println("List after removing duplicates and sorting: " + List);
    }
}
