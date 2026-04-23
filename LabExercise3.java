
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LabExercise3 {

    public static void main(String[] args) {
        // Create an ArrayList to store Player objects
        ArrayList<Player> listPlayer = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        // file path
        String filePath = "C:/Users/Zenith/Documents/UiTM Semester/Semester 3/CSC248/Lab/player.txt";
        // Read player data from the file and populate the listPlayer ArrayList
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file, split it into nickname and score, create a Player object, and add it to the list
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); // Assuming nickname and score are separated by a comma
                if (parts.length == 2) {// Check if the line has both nickname and score
                    String nickname = parts[0].trim();// Get the nickname and trim any whitespace
                    int score = Integer.parseInt(parts[1].trim());// Get the score, trim whitespace, and convert to an integer
                    Player playerObj = new Player(nickname, score);// Create a new Player object with the nickname and score
                    listPlayer.add(playerObj); // Add the player object to the list
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading player file");
        }
        //display players
        System.out.println("Players read from file:");
        for (Player player : listPlayer) {
            System.out.println(player);
        }
        //count total score and average score and highest score
        int totalScore = 0;
        int highestScore = 0;
        //variable to store the name of the player with the highest score
        String highestScorePlayer = "";
        // Loop through the list of players to calculate total score and find the highest score
        for (Player player : listPlayer) {
            totalScore += player.getScore();
            if (player.getScore() > highestScore) {
                highestScore = player.getScore();
                highestScorePlayer = player.getName();
            }
        }
        // Calculate average score
        double averageScore = (double) totalScore / listPlayer.size();
        // Display total score, average score, and highest score player
        System.out.println("\nTotal Score: " + totalScore);
        System.out.println("\nAverage Score: " + averageScore);
        System.out.println("\nHighest Score Player: " + highestScorePlayer + " with a score of " + highestScore);
        //display array
        System.out.println("\nBefore Sorting: " + listPlayer);
        System.out.println("\nSorting...");
        // Insertion Sort
        for (int i = 0; i < listPlayer.size(); i++) {//traverse through the list starting from the first element
            Player value = listPlayer.get(i); // Store the current value to be compared aka the first index
            int n = i - 1;  // Start comparing with the previous elements
            while (n >= 0 && listPlayer.get(n).getName().compareTo(value.getName()) > 0) {// Compare the current element with the value, if it's greater, shift it to the right
                listPlayer.set(n + 1, listPlayer.get(n)); // Shift elements to the right
                n--;    // Move to the previous element
            }
            listPlayer.set(n + 1, value); // Insert the value at its correct position

        }
        System.out.println("\nAfter Sorting: " + listPlayer);
        //prompt user to enter a nickname and search for the player using binary search
        System.out.print("Enter a nickname to search for: ");
        String searchName = scan.nextLine();
        //binary search for a player by nickname
        int n = listPlayer.size();
        int left = 0;
        int right = n - 1;
        int foundIndex = -1;
        //loop
        while (left <= right) {
            int mid = (left + right) / 2;
            if (searchName.equals(listPlayer.get(mid).getName())) {
                foundIndex = mid;
                break;
            } else if (searchName.compareTo(listPlayer.get(mid).getName()) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (foundIndex == -1) {
            System.out.println("The search nickname is not in the list.");
        } else {
            System.out.println("Player at index: " + foundIndex + " with score: " + listPlayer.get(foundIndex).getScore());
        }
        scan.close();
    }
}
