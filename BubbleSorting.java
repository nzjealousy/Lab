/*
 * Bubble Sorting Algorithm
 * @nzjealousy : Nicholas Langit
 * 13/4/2026
 */

import java.util.ArrayList;

public class BubbleSorting {

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        // Generate 10 random integers between 0 and 1000
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 51); // 0–100 inclusive
            listA.add(number);
        }

        System.out.println("Before Sorting: " + listA);
        // Bubble Sort ascending order
        for (int i = 0; i < listA.size() - 1; i++) {
            for (int n = 0; n < listA.size() - i - 1; n++) {    // Compare adjacent elements
                if (listA.get(n) > listA.get(n + 1)) {  // Swap if the current element is greater than the next element
                    int temp = listA.get(n);    // Store the current element in a temporary variable
                    listA.set(n, listA.get(n + 1)); // Move the next element to the current position
                    listA.set(n + 1, temp); // Move the current element (stored in temp) to the next position
                }
            }
        }
        System.out.println("After Sorting: " + listA);

        for (int i = 0; i < listA.size() - 1; i++) {
            for (int n = 0; n < listA.size() - i - 1; n++) {    // Compare adjacent elements
                if (listA.get(n) < listA.get(n + 1)) {  // Swap if the current element is greater than the next element
                    int temp = listA.get(n);    // Store the current element in a temporary variable
                    listA.set(n, listA.get(n + 1)); // Move the next element to the current position
                    listA.set(n + 1, temp); // Move the current element (stored in temp) to the next position
                }
            }
        }
        System.out.println("After Sorting (Descending): " + listA);

    }
}
