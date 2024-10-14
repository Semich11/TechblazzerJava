package stack;

public class Stack {
    private int size = 0;
    private final String[] element;

    public Stack(int capacity) {
        this.element = new String[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(String gString) {
        if(isFull()) throw new IllegalArgumentException("Stack is full");
        element[size] = gString;
        size++;

    }

    public String pop() {
        size--;
        return element[size];
    }

    public boolean isFull() {
        return size == element.length;
    }

    public int size() {
        return size;
    }
}
