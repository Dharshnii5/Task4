import java.util.Stack;

public class StackExample {
    private Stack<Integer> stack;

    public StackExample() {
        stack = new Stack<>();
    }

    // Method to push elements onto the stack
    public void pushElement(Integer element) {
        stack.push(element);
        System.out.println("Pushed element: " + element);
    }

    // Method to pop elements from the stack
    public Integer popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return null;
        } else {
            Integer poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    public static void main(String[] args) {
        StackExample stackExample = new StackExample();

        // Push some elements onto the stack
        stackExample.pushElement(10);
        stackExample.pushElement(20);
        stackExample.pushElement(30);

        // Pop elements from the stack
        stackExample.popElement();
        stackExample.popElement();
        stackExample.popElement();
        stackExample.popElement(); // Trying to pop when stack is empty
    }
}
