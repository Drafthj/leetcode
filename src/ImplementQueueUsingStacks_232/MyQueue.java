package ImplementQueueUsingStacks_232;

import java.util.Stack;

/**
 * Created by drafthj on 2016/12/8 10:04.
 */
class MyQueue {
    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();
    // Push element x to the back of queue.
    public void push(int x) {
        stack1.push(x);
    }
    private void move(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    // Removes the element from in front of queue.
    public void pop() {
        if(stack2.isEmpty()){
            move();
        }
        stack2.pop();
    }

    // Get the front element.
    public int peek() {
        if(stack2.isEmpty()){
            move();
        }
        return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}
