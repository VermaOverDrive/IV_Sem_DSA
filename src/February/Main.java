package February;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ll=new SinglyLinkedList();
        ll.insertAtEnd(new Node( 5));
        ll.print();
        ll.insertAtBegin(new Node( 88));
        ll.insertAtEnd(new Node( 6));
        ll.print();
        ll.insertAtEnd(new Node(9));
        ll.insertAtEnd(new Node(10));
        ll.insertAtEnd(new Node(11));
        ll.print();
        ll.insertAtBegin(new Node(8 ));
        ll.print();
        ll.insertAtMiddle(new Node(3));
        ll.deleteAtBegin();

        ll.print();

    }
}
