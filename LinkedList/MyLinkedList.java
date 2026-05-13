
public class MyLinkedList<E> {

    //attributes
    private Node<E> first;
    private Node<E> last;
    private Node<E> current;

    //default constructor
    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.current = null;
    }

    //normal constructor
    public MyLinkedList(E data) {
        first = new Node<>(data);
        this.last = first;
        this.current = first;
    }

    //check list contains any node
    public boolean isEmpty() {
        return first == null; //if first is null, then the list is empty
    }

    //insert a node at the front of the list
    public void insertAtFront(E insertItem) {
        Node<E> newNode = new Node<>(insertItem);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
            current = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    //insert a node at the back of the list
    public void insertAtBack(E insertItem) {
        Node<E> newNode = new Node<>(insertItem);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
            current = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    //remove a node at the front of the list
    public E removeFromFront() {
        E removeItem = null;
        if (isEmpty()) {
            return null; //nothing to remove
        }
        removeItem = first.data; //store the data of the node to be removed
        if (first == last) { //only one node in the list
            first = null;
            last = null;
            current = null;
        } else {
            first = first.next; //move the first pointer to the next node
        }
        System.out.println("Removed item: " + removeItem);
        return removeItem;
    }

    //remove a node at the back of the list
    public E removeFromBack() {
        E removeItem = null;
        if (isEmpty()) {
            return null; //nothing to remove
        }
        removeItem = last.data; //store the data of the node to be removed
        if (first == last) { //only one node in the list
            first = null;
            last = null;
            current = null;
        } else {
            current = first;
            while (current.next != last) { //traverse the list to find the second last node
                current = current.next;
            }
            current.next = null; //remove the last node
            last = current; //update the last pointer
        }
        System.out.println("Removed item: " + removeItem);
        return removeItem;
    }

    //print the list
    public void display() {
        Node<E> temp = first;
        while (temp != null) {
            E data = temp.data;
            System.out.print("[" + data + "]");
            if (temp.next != null) {
                System.out.print(" ---> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

}
