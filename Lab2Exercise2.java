
import java.util.ArrayList;
import java.util.Scanner;

public class Lab2Exercise2 {

    public static void main(String[] args) {
        ArrayList<String> animalList = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Animal :");
            String animal = scan.nextLine();
            animalList.add(animal);
        }
        System.out.println("Animals in the list: " + animalList);
        System.out.println("Before Sorting: " + animalList);
        System.out.println("Sorting...");
        // Insertion Sort
        for (int i = 0; i < animalList.size(); i++) {//traverse through the list starting from the first element
            String value = animalList.get(i); // Store the current value to be compared aka the first index
            int n = i - 1;  // Start comparing with the previous elements
            while (n >= 0 && animalList.get(n).compareTo(value) > 0) {// Compare the current element with the value, if it's greater, shift it to the right
                animalList.set(n + 1, animalList.get(n)); // Shift elements to the right
                n--;    // Move to the previous element
            }
            animalList.set(n + 1, value); // Insert the value at its correct position

        }
        System.out.println("After Sorting: " + animalList);
    }
}
