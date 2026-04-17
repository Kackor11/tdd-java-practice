package pl.korzekwa.queue;

public class Node<A> {

    public A value;

    public Node<A> next;

    public Node(A value) {
        this.value = value;
        this.next = null;
    }
    
}