package March.m_04;

public class stackUsingArray {
    int top;
    int[] arr;

    public stackUsingArray(int size) {
        arr = new int[size];
        this.top = -1;

    }

    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            arr[top] = data;

        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");

        } else {
            System.out.println(arr[top]);
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }

    public void full() {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
    }

    public void empty(){
        if(top==-1){
            System.out.println("Stack is empty");

        }
        else{
            System.out.println("Stack is not empty");
        }
    }

}
