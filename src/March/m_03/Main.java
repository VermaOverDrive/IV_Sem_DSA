package March.m_03;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dd=new DoublyLinkedList() ;
        dd.insertAtEnd(new Node (9));
        dd.insertAtEnd(new Node(7));
        dd.print();
        dd.insertAtEnd(new Node(99));
        dd.print();
        dd.insertAtBegin(new Node(88));
        dd.print();
    }
}

