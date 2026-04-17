package pl.korzekwa.queue;

public class Queue<A> {

    public Node<A> head;

    public Queue() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(A value) {
        
        Node<A> newNode = new Node<>(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<A> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }
}