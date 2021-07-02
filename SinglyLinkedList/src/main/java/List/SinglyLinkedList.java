package List;

public class SinglyLinkedList<T> {

    // Head of the linked list
    Node<T> head;

    // Determines if the list is empty by checking if the list head has been set to a value
    public boolean isEmpty(){
        return head == null;
    }

    // Insertion methods

    // Updates the end of the list by first traversing to the tail, then
    // setting its next pointer to the address of the new node
    public void append(T value) {

        // Create a new node object with the given value
        Node<T> node = new Node(value);
        node.next = null;

        // If the list is empty, set the head to the new node
        if (head == null) {
            head = node;
        } else {
            // Start traversal from the head of the list
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Set the tail element to the new node
            current.next = node;
        }
    }

    // Updates the head of the list by first setting the new node's next element to the
    // current head. Then, the new node becomes the new head.
    public void prepend(T value) {
        // Create a new node object with the given value
        Node<T> newNode = new Node(value);

        // Set new node's next value to the head
        newNode.next = head;
        // Set the head to the new node
        head = newNode;
    }

    // Inserts a node into the list after a given node
    public void insertAfter(T currentVal, T newVal) {
        // Create a new node object with the given value
        Node<T> newNode = new Node(newVal);

        // Start traversing the list from the head
        Node<T> currentNode = head;
        while (currentNode != null) {
            // If the current value is found
            if (currentNode.data == currentVal) {
                // Set new node's next value to the current node's next value
                newNode.next = currentNode.next;
                // Set current node's next value to the new node value
                currentNode.next = newNode;
                break;
            } else {
                // Continue with traversal of the list
                currentNode = currentNode.next;
            }
        }
    }

    /* Removes a node from the list by traversing the list while keeping
     track of the previous and current nodes. If the current node is the
     desired element to be deleted, the previous node's next pointer is
     directed towards the current node's next element. */
    public void removeNode(T value) {

        try {
            // Declare the head and previous nodes
            Node<T> currentNode = head;
            Node<T> prevNode = null;

            // If the node to be deleted is found in the head
            if ((currentNode != null) && (currentNode.data == value)) {
                head = currentNode.next;
            }

            // Search for the node to be deleted
            // Keep updating the previous and temporary nodes until the value is found
            while ((currentNode != null) && (currentNode.data != value)) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }

            // If the value to be deleted is not found
            if (currentNode == null) {
                return;
            }

            // Unlink the node from the linked list
            prevNode.next = currentNode.next;
        } catch (NullPointerException e) {
            System.out.println("This list is empty");
        }

    }

    // Searches for a value in the list by traversal.
    // True is returned if the node's element is found.
    // False is returned if the node's element is not found.
    public boolean searchList(T value) {

        // Generate a new node object
        Node<T> searchedValue = new Node(value);

        // Start traversal from the head of the list
        Node<T> current = head;
        while (current != null) {
            // If the current node's data is equal to the desired node
            if (current.data == searchedValue.data) {
                // Return true
                return true;
            } else {
                // Else, continue to the next node
                current = current.next;
            }
        }
        // Return false if the node is not found
        return false;
    }

    // Print the list be traversing from the head and printing
    // each node's data at each iteration
    public String printList() {

        // Start traversal from the head
        Node<T> node = head;

        String str = "";
        while (node.next != null) {
            // Print the node's data
            str += node.data.toString() + " -> ";
            node = node.next;
        }
        str += node.data.toString();
        return str;
    }

    // Returns the size of the list
    public int size() {
        int count = 0;
        Node<T> curr = head;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
