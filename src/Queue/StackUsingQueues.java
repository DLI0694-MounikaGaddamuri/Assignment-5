package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();


    public void push(int x){
        q1.add(x);
    }

    public int pop(){
        if(q1.isEmpty())
            throw new RuntimeException("Stack is empty");
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int top=q1.remove();
        Queue<Integer> temp = q1;
        q1=q2;
        q2=temp;

        return top;
    }

    public int top(){
        if(q1.isEmpty())
            throw new RuntimeException("Stack is Empty.");
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int top=q1.remove();
        q2.add(top);

        Queue<Integer> temp = q1;
        q1=q2;
        q2=temp;

        return top;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element is: " + stack.top());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Top element is: " + stack.top());
    }
}
