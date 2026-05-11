
public class Node<E> {

    //attributes
    E data;
    Node<E> next;

    //constructor
    public Node(E item) {
        this.data = item;
        this.next = null;
    }
}
