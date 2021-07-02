package List;

public class Node<T> {

    // Field to hold node's data
    T data;
    // Pointer to the next element
    Node<T> next;

    // Constructor
    Node(T data) {
        this.data = data;
    }

    // No-argument constructor
    public Node() {

    }
}
