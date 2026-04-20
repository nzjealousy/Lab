
import java.util.ArrayList;

public class TestInsertion {

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        //add 14,6,28,96,4
        listA.add(14);
        listA.add(6);
        listA.add(28);
        listA.add(96);
        listA.add(4);
        System.out.println("Before Sorting: " + listA);
        // Insertion Sort
        for (int i = 1; i < listA.size(); i++) {
            int value = listA.get(i);
            int n = i - 1;
            while (n >= 0 && listA.get(n) > value) {
                listA.set(n + 1, listA.get(n));
                n--;
            }
            listA.set(n + 1, value);
        }
        System.out.println("After Sorting: " + listA);
    }
}
