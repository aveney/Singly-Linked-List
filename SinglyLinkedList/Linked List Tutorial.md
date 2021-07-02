# Singly Linked List Tutorial
*By: Adriaan Veney*

### How it works/stores data:
* A Linked List works by having a collection of objects called "nodes" linked together. Each node holds a value and a pointer to the address in memory of its successive node. 
* The first node in a Linked List is called the "head"
* The final node in a Linked List is called the "tail"
* The tail's next pointer points to null

 ![](data:image/jpeg;base64,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)

### How a client interacts with it (interface):
* Clients interact with a Linked List by declaring an instance of its class. Methods are used to insert, remove, and search for data in the list. 
* Insertion methods:
	* append(): Updates the list tail
	* prepend(): Updates the list head
	* insertAfter(): Adds a node to a list before a given node
* Remove methods:
	*  removeNode(): Deletes a node from the list
*  Search methods:
	* search(): Search for a given node. True will be returned if the node is found. False will be returned if the node is not in the list.   

### Pros of using a Linked List:
* Dynamic data structure able to add/remove elements at runtime
* Memory is not wasted when nodes are deleted
* The utilize generics and are not limited to a specific data type

### Cons of using a Linked List:
* O(N) time complexity for some operations
* Traversal of the list is required to return a specific node

### Linked List Time Complexity:
**The methods that yield O(N) time complexity require a traversal of the list. Methods with O(1) have a constant runtime.**

* Insertion:
	* append(): O(N)
	* prepend(): O(1)
	* insertAfter(): O(N)
* removeNode(): O(N)
* search(): O(N) 

## Building a Linked List

### Step 1: Generate Node Class
```
public class Node<T> {

    // Field to hold the node's data
    T data;
    // Pointer to the next element's address in memory
    Node<T> next;

    // Constructor
    Node(T data) {
        this.data = data;
    }

    // No-argument constructor
    public Node() {

    }
}
```
### Step 2: Generate the SinglyLinkedList Class
```
public class SinglyLinkedList<T> {

    // Head of the linked list
    Node<T> head;

    public boolean isEmpty(){}
    public void append(T value) {}
    public void prepend(T value) {}
    public void insertAfter(T currentVal, T newVal) {}
    public void removeNode(T value) {}
    public boolean searchList(T value) {}
    public void printList() {}
}
```
### Step 3: Method implementation for SinglyLinkedList
* **isEmpty() method:**

```
    // Determines if the list is empty by checking if the 
    // list head has been set to a value
    public boolean isEmpty(){
        return head == null;
    }
```

* **append() method:**

```
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
```

* **prepend() method:**

```
    // Updates the head of the list by first setting the new node's 
    // next element to the current head. Then, the new node 
    // becomes the new head.
    public void prepend(T value) {
    
        // Create a new node object with the given value
        Node<T> newNode = new Node(value);

        // Set new node's next value to the head
        newNode.next = head;
        // Set the head to the new node
        head = newNode;
    }
```

* **insertAfter() method:**

```
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
```
* **removeNode() method:**

```
	// Removes a node from the list by traversing the list while keeping
   // track of the previous and current nodes. If the current node is the
   // desired element to be deleted, the previous node's next pointer is
   // directed towards the current node's next element. 
     
	public void removeNode(T value) {

        // Declare the head and previous nodes
        Node<T> currentNode = head;
        Node<T> prevNode = null;

        // If the node to be deleted is found in the head
        if ((currentNode != null) && (currentNode.data == value)) {
            head = currentNode.next;
        }

        // Search for the node to be deleted
        // Keep updating the previous and temporary nodes until the 
        // value is found
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
    }
```

* **searchList() method:**

```
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
```

* **printList() method:**

```
	// Print the list by traversing from the head and printing
    // each node's data at each iteration
    public void printList() {
        
        // Start traversal from the head
        Node<T> node = head;
        
        while (node.next != null) {
        
            // Print the node's data
            System.out.println(node.data);
            
            // Continue to next node
            node = node.next;
        }
        System.out.println(node.data);
    }
```

## Examples with Linked Lists
```
 public static void main (String[] args) {

        // Create a singly linked list object
        SinglyLinkedList list = new SinglyLinkedList();

        // This section will print the elements in the following order:
        // 10, 4, 7, 5, hello
        list.append(4);
        list.append(5);
        list.insertAfter(4, 7);
        list.append("hello");
        list.prepend(10);
        list.printList();

        // This section will print the elements in the following order:
        // 10, 7, 5, hello, true
        System.out.println();
        list.removeNode(4);
        list.printList();
        System.out.println(list.searchList(10));
    }
```