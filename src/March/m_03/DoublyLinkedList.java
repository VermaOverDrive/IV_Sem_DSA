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
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
    }

    public void insertAtBegin(Node newNode) {
        if (head == null) {
            head = tail = newNode;

        } else {
            head.prev =newNode;
            newNode.next=head;
            head=newNode;
        }
    }


    public void deleteAtEnd(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
           tail=tail.prev;
           tail.next=null;
        }
    }


    public void print() {
        if (head == null) {
            System.out.println(" LinkedList is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(+temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println();

        }
    }
}

