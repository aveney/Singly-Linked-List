package List;

public class Runner {

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
        System.out.println(list.size());
        System.out.println(list.printList());

        // This section will print the elements in the following order:
        // 10, 7, 5, hello, true
        System.out.println();
        list.removeNode(4);
        System.out.println(list.printList());
        System.out.println(list.searchList(10));
    }

}
