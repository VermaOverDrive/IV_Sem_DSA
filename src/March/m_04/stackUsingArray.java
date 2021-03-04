package March.m_04;

public class stackUsingArray {
    int top ;
    int[]arr;

    public stackUsingArray(int size){
        arr=new int[size];
        this.top=-1;

    }

    public void push(int data){
        if(top==arr.length-1){
            System.out.println("Stack is null");
        }
        else{
            top++;
            arr[top]=data;

        }

    }


}
