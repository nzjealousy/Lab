
import java.util.ArrayList;
import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> numlist = new ArrayList<>();
        numlist.add(11);
        numlist.add(2);
        numlist.add(33);
        numlist.add(4);
        numlist.add(5);
        numlist.add(6);
        numlist.add(7);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNum = scan.nextInt();

        int n = numlist.size();
        int left = 0;
        int right = n - 1;
        int foundIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (searchNum == numlist.get(mid)) {
                foundIndex = mid;
                break;
            } else if (searchNum < numlist.get(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (foundIndex == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("Number found at index: " + foundIndex);
            System.out.println(numlist);
        }
        //String search
        ArrayList<String> datalist = new ArrayList<>();
        datalist.add("Alice");
        datalist.add("Bob");
        datalist.add("Charlie");
        datalist.add("David");
        datalist.add("Eve");
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String searchName = scan2.nextLine();

        int n2 = datalist.size();
        int left2 = 0;
        int right2 = n2 - 1;
        int foundIndex2 = -1;

        while (left2 <= right2) {
            int mid2 = (left2 + right2) / 2;
            if (searchName.equals(datalist.get(mid2))) {
                foundIndex2 = mid2;
                break;
            } else if (searchName.compareTo(datalist.get(mid2)) < 0) {
                right2 = mid2 - 1;
            } else {
                left2 = mid2 + 1;
            }
        }
        if (foundIndex2 == -1) {
            System.out.println("Name not found.");
        } else {
            System.out.println("Name found at index: " + foundIndex2);
            System.out.println(datalist);
        }
    }
}
