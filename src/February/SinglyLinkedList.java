package February;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.next= newNode;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBegin(Node newNode) {
        if (head==null) {
            head =newNode;
            return;

        }
        Node temp=head;
        head=newNode;
        newNode.next=temp;


    }
    public void insertAtMiddle(Node newNode ) {
            if(head==null){
                head =newNode ;
                return;

            }
            Node slow =head;
            Node fast=head;
            while(fast.next!=null && fast.next.next!= null){
                slow=slow.next;
                fast=fast.next.next;

            }
              Node  temp=slow.next;
              slow.next=newNode;
              newNode.next=temp;

    }
    public void deleteAtEnd(){
        if(isEmpty() || head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void deleteAtBegin(){

    }

    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
        System.out.println("List is empty");
    }
}

