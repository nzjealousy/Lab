
public class explorenode {

    public static void main(String[] args) {
        Node<String> head = null;
        Node<String> tail = null;
        Node<String> current = null;
        head = new Node<String>("CSC126");
        tail = head;

        tail.next = new Node<>("CSC186");
        tail.next = tail.next;

        tail.next = new Node<>("CSC248");
        tail = tail.next;

        //put after CSC126
        tail.next = new Node<>("MAT133");
        head.next = tail.next;

        current = head;
        while (current != null) {
            String subject = current.data;
            System.out.print("[" + subject + "]");
            if (current.next != null) {
                System.out.print(" --->");
            }
            current = current.next;
        }
    }

}
