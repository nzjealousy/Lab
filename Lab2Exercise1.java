//Exercise 1

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2Exercise1 {

    public static void main(String[] args) {
        ArrayList<String> flowerList = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String flower;
        //1. store 5 flowers in the list
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter FLower :");
            flower = scan.nextLine();
            flowerList.add(flower);
        }
        //2. display list
        for (int i = 0; i < flowerList.size(); i++) {
            for (int n = 0; n < flowerList.size() - i - 1; n++) {    // Compare adjacent elements
                System.out.print("\t");
                System.out.print(flowerList.get(n).compareTo(flowerList.get(n + 1)) > 0);
            }
        }
        System.out.println("\nBefore Sorting: " + flowerList);
        // Bubble Sort ascending order
        for (int i = 0; i < flowerList.size() - 1; i++) {
            for (int n = 0; n < flowerList.size() - i - 1; n++) {    // Compare adjacent elements
                if (flowerList.get(n).compareTo(flowerList.get(n + 1)) > 0) {  // Swap if the current element is greater than the next element
                    String temp = flowerList.get(n);    // Store the current element in a temporary variable
                    flowerList.set(n, flowerList.get(n + 1)); // Move the next element to the current position
                    flowerList.set(n + 1, temp); // Move the current element (stored in temp) to the next position
                }
            }
        }
        System.out.println("After Sorting: " + flowerList);
        System.out.println("Before Sorting: " + flowerList);
        // Bubble Sort descending order
        for (int i = 0; i < flowerList.size() - 1; i++) {
            for (int n = 0; n < flowerList.size() - i - 1; n++) {    // Compare adjacent elements
                if (flowerList.get(n).compareTo(flowerList.get(n + 1)) < 0) {  // Swap if the current element is less than the next element
                    String temp = flowerList.get(n);    // Store the current element in a temporary variable
                    flowerList.set(n, flowerList.get(n + 1)); // Move the next element to the current position
                    flowerList.set(n + 1, temp); // Move the current element (stored in temp) to the next position
                }
            }
        }
        System.out.println("After Sorting: " + flowerList);
    }
}
