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
            System.out.println(temp.next);
            temp = temp.next;
        }
        temp.next= newNode;
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
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
