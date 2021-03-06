package March.m_05;

public class StackUsingLinkedList {
    Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    public void push(Node newNode) {
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

    }

    public void pop() {
        if (top == null) {
            return;
        }
        System.out.println(top.data);
        top = top.next;

    }

    public void peek() {
        if (top == null) {
            return;
        }
        System.out.println(top.data);
    }

    public void print() {
        if (top == null){
            System.out.println("Stack is empty");
        }
        else{
            Node temp= top;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}

