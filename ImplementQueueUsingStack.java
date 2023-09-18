import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack <Integer> stack1;
    Stack <Integer> stack2;
    int front;
    public ImplementQueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        if(stack1.empty())
            front = x;
        while(!stack1.empty())
            stack2.push(stack1.pop());
        stack2.push(x);
        while(!stack2.empty())
            stack1.push(stack2.pop());
    }
    
    public int pop() {
        int result = stack1.pop();
        if(!stack1.empty())
            front = stack1.peek();
        return result;
    }
    
    public int peek() {
        return front;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}
