
import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        //create linkedlist obj
        LinkedList<String> listA = new LinkedList<>();

        System.out.println("List is empty" + listA.isEmpty());

        //insert data front of list
        listA.addFirst("Andy");
        listA.addFirst("Bob");
        listA.addFirst("Cindy");
        listA.add("Danny");
        listA.add(2, "Emmy");
        listA.addLast("Freddy");

        //display
        System.out.println("List A\n" + listA);

        System.out.println("Name at index 3: " + listA.get(3));
        System.out.println("First name: " + listA.getFirst());
        System.out.println("Last name: " + listA.getLast());

        listA.removeFirst();
        System.out.println("List A after remove first\n" + listA);
        listA.removeLast();
        System.out.println("List A after remove last\n" + listA);
    }
}
