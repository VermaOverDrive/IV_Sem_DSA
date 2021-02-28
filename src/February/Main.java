package February;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList LL=new SinglyLinkedList();
        LL.insertAtEnd(new Node( 5));
        LL.insertAtBegin(new Node( 88));
        LL.insertAtEnd(new Node( 6));
        LL.insertAtEnd(new Node(9));
        LL.insertAtEnd(new Node(10));
        LL.print();
        LL.insertAtBegin(new Node(8 ));
        LL.print();
        LL.insertAtMiddle(new Node(3));
        LL.print();
        LL.insertAtMiddle(new Node(888));

        LL.print();

    }
}
