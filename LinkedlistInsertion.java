class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedlistInsertion {
    Node head;

    public LinkedlistInsertion() {
        this.head = null;
    }

    // Insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // If position is 0 or negative, insert at the beginning
        if (position <= 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse the list to the node at the position just before the desired position
        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        // If the position is beyond the end of the list, insert at the end
        if (current == null) {
            System.out.println("Position exceeds the length of the list. Inserting at the end.");
            insertAtEnd(data);
            return;
        }

        // Insert the new node at the desired position
        newNode.next = current.next;
        current.next = newNode;
    }

    // Insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Display the linked list
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedlistInsertion linkedList = new LinkedlistInsertion();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);

        System.out.println("Original Linked List:");
        linkedList.display();

        // Insert a node at position 1 (inserting at the beginning)
        linkedList.insertAtPosition(0, 1);

        // Insert a node at position 5 (inserting at the end)
        linkedList.insertAtPosition(4, 5);

        // Insert a node at position 2
        linkedList.insertAtPosition(10, 2);

        System.out.println("Linked List after insertions:");
        linkedList.display();
    }
}
