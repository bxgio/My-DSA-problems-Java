import java.util.EmptyStackException;

public class StackImpl {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public StackImpl() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(Object item) {
        ensureCapacity();
        array[size++] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object poppedItem = array[--size];
        array[size] = null; // To avoid memory leak
        return poppedItem;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = size * 2;
            array = java.util.Arrays.copyOf(array, newCapacity);
        }
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();

        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        System.out.println("Size of stack: " + stack.size());

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Size of stack after pops: " + stack.size());
    }
}
