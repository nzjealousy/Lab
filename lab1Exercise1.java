
/**
 * Lab 1 Exercise 1 activity of class TestStrList .
 *
 * Nicholas Langit
 * 8/6/2024
 *
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class lab1Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> vegeList = new ArrayList<String>();
        //1. add 5 type of vegies to the list
        System.out.println("Enter 5 type of vegies:");
        for (int i = 0; i < 5; i++) {
            String vege = scanner.nextLine();
            vegeList.add(vege);
        }
        //display list
        System.out.println("Vege list: " + vegeList);
        //2. display index 3
        System.out.println("Vege index 3 : " + vegeList.get(3));
        //3&4. display index of specific elements
        System.out.println("Index of bendi: " + vegeList.indexOf("bendi"));
        System.out.println("Index of jagung: " + vegeList.indexOf("jagung"));
        //5. replace an element
        System.out.print("Replace 2nd vege with kubis : ");
        String vege = scanner.nextLine();
        vegeList.set(1, vege);
        //display list
        System.out.println("Updated vege list: " + vegeList);
        //6. remove an element by index
        System.out.print("Remove 4th vege: ");
        int index = scanner.nextInt();
        vegeList.remove(index);
        //display list
        System.out.println("Updated vege list: " + vegeList);
        //7. remove an element by value
        scanner.nextLine(); // consume the newline
        System.out.print("Remove timun: ");
        vege = scanner.nextLine();
        vegeList.remove(vege);
        //display list
        System.out.println("Updated vege list: " + vegeList);
        //8. remove an element by value
        System.out.print("Remove bendi: ");
        vege = scanner.nextLine();
        vegeList.remove(vege);
        //display list
        System.out.println("Updated vege list: " + vegeList);
    }
}
