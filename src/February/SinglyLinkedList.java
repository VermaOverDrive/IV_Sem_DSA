package February;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(Node head) {
        this.head = null;
    }

    public void insertAtEnd(Node newNode){
        if(head==null){
            head=newNode;
            return;
        }
        Node temp= head;
        while(temp!=null){
            temp=temp.next;
        }
        temp=newNode;
    }
}
