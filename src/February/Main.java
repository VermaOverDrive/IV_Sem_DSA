package February;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList LL=new SinglyLinkedList();
        LL.insertAtEnd(new Node( 5));
        LL.insertAtEnd(new Node( 6));
        LL.insertAtEnd(new Node(9));
        LL.insertAtEnd(new Node(10));
        LL.print();
    }
}
