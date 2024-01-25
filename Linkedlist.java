
class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist {
    Node head;

    public Linkedlist() {
        this.head = null;
    }

    public void insertAtEnd(String data) {
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

    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Linkedlist linkedList = new Linkedlist();
        linkedList.insertAtEnd("Bagio");
        linkedList.insertAtEnd("Tasio");
        linkedList.insertAtEnd("Messi");

        System.out.println("Linked List: ");
        linkedList.display();
    }
}
