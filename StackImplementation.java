package org.task.assignment5;
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top; 
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; 
    }
    public void push(int x) {
        if (isFull()) {
            throw new RuntimeException("Stack is full. Cannot push element.");
        }
        stackArray[++top] = x;
    }
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop element.");
        }
        return stackArray[top--]; 
    }
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek element.");
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
}
}
public class StackImplementation {
	    public static void main(String[] args) {
	        Stack stack = new Stack(5); 
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);
	        stack.display();
	        System.out.println("Top element: " + stack.peek()); 
	        System.out.println("Popped element: " + stack.pop()); 
	        System.out.println("Popped element: " + stack.pop());
	        stack.display();
}
}

