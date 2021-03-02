package March.m_03;

public class DoublyLinkedList {
    public Node head;
    public Node tail;


    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(Node newNode) {
        if (head == null) {
                head=tail=newNode;
        }
        else
            tail.next=newNode;
            newNode.prev=tail;
            tail=tail.next;





    }
}
