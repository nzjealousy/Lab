/*
 * Bubble Sorting Algorithm
 * @nzjealousy : Nicholas Langit
 * 13/4/2026
 */

import java.util.ArrayList;

public class InsertionSort {

    public static void main(String[] args) {
        ArrayList<Integer> listB = new ArrayList<>();
        // Generate 50 random integers between 0 and 1000
        for (int i = 0; i < 50; i++) {
            int number = (int) (Math.random() * 1001); // 0–100 inclusive
            listB.add(number);
        }
        System.out.println("Before Sorting: " + listB);
        System.out.println("Sorting...");
        // Insertion Sort
        for (int i = 0; i < listB.size(); i++) {
            int value = listB.get(i); // Store the current value to be compared
            int n = i - 1;  // Start comparing with the previous elements
            while (n >= 0 && listB.get(n) > value) {
                listB.set(n + 1, listB.get(n)); // Shift elements to the right
                n--;    // Move to the previous element
            }
            listB.set(n + 1, value); // Insert the value at its correct position

        }
        System.out.println("After Sorting: " + listB);
    }
}
