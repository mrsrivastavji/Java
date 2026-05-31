class StackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackArray(int size) {
        this.maxSize = size;
        this.stackArray = new int[size];
        this.top = -1;
    }   
    public void push(int value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
        } else {
            throw new IllegalStateException("Stack is full. Cannot push " + value);
        }
    }
    public int pop() {
        if (top >= 0) {
            int value = stackArray[top];
            top--;
            return value;
        } else {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
    }
    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public int size() {
        return top + 1;
    }
    public void display() {
        if (top >= 0) {
            System.out.print("Stack contents: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty. Nothing to display.");
        }
    }   
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        stack.display();
        System.out.println("Stack size: " + stack.size());
    }
}