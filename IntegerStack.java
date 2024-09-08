import java.util.Stack;

public class IntegerStack {//program to store integers
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(Integer element) {
        stack.push(element);
    }

    // Method to pop an element from the stack
    public Integer pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
    }

    // Method to check the top element of the stack
    public Integer peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            throw new IllegalStateException("Stack is empty.");
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        // Pushing elements onto the stack
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        // Popping elements from the stack
        System.out.println("Popped element: " + integerStack.pop());
        System.out.println("Popped element: " + integerStack.pop());

        // Checking the top element
        System.out.println("Top element: " + integerStack.peek());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + integerStack.isEmpty());

        // Popping the last element
        System.out.println("Popped element: " + integerStack.pop());

        // Checking if the stack is empty again
        System.out.println("Is stack empty? " + integerStack.isEmpty());
    }
}
