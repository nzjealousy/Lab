
public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList<String> myList1 = new MyLinkedList<>();
        MyLinkedList<String> myList2 = new MyLinkedList<>("Andy");

        System.out.println("myList1 is empty: " + myList1.isEmpty());
        System.out.println("myList2 is empty: " + myList2.isEmpty());

        //insert some nodes at the front of the list
        myList2.insertAtFront("Bobby");
        //insert some nodes at the back of the list
        myList2.insertAtBack("Cathy");

        //display the list
        System.out.println("Node in myList2: ");
        myList2.display();

    }

}
