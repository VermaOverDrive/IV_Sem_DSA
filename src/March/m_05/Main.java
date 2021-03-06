package March.m_05;

public class Main {
    public static void main(String[] args) {
        StackUsingLinkedList yash=new StackUsingLinkedList();
        yash.push(new Node(5));
        yash.push(new Node (80));
        yash.push(new Node(96));
        yash.print();
        yash.pop();
        yash.print();
    }
}
