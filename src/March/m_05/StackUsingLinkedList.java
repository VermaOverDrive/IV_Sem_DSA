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
        top=top.next;
    }

    public void peek(){
        if(top==null){
            return;
        }
        System.out.println(top.data);
    }

}

