package Stack;

import java.util.Stack;

public class QueueUsingStacks {
    static Stack<Integer> input = new Stack<>();
    static Stack<Integer> output = new Stack<>();

    static class Queue{

        public void enQueue(int x) {
            System.out.println("Pushed");
            input.push(x);
            System.out.println(input.peek());
        }

        public void deQueue() {
            if (!output.isEmpty())
                output.pop();
            else {
                while (!input.empty()) {
                    output.push(input.pop());
                }
                if(!output.isEmpty())
                    output.pop();
            }
        }

        public int top(){
            //int res=0;
            if(!output.isEmpty()) {
                System.out.println("Okay!!");
                return output.peek();
            }

            while(!input.empty()){
                System.out.println("Pushing into output!");
                    output.push(input.pop());
            }
            return output.isEmpty()?-1:output.peek();
        }
    }
    public static void main(String[] args) {

            Queue queue = new Queue();
            queue.enQueue(2);
            queue.enQueue(5);
            queue.enQueue(3);

        System.out.println(queue.top());
            queue.deQueue();
            queue.enQueue(6);
            queue.deQueue();
            queue.deQueue();
        System.out.println(queue.top());

    }
}
