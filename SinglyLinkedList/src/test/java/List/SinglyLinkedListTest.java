package List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SinglyLinkedListTest {


    @Test
    void isEmpty() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(2);
        list.append(30);
        list.append(400);
        boolean expected = false;
        boolean actual = list.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void append() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(4);
        list.append(25);
        list.append(7);
        String expected = "4 -> 25 -> 7";
        String actual = list.printList();
        assertEquals(expected, actual);
    }

    @Test
    void prepend() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(350);
        list.append(3);
        list.append(80);
        list.prepend(1);
        String expected = "1 -> 350 -> 3 -> 80";
        String actual = list.printList();
        assertEquals(expected, actual);
    }

    @Test
    void insertAfter() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(4);
        list.append(8);
        list.insertAfter(4, 15);
        String expected = "4 -> 15 -> 8";
        String actual = list.printList();
        assertEquals(expected, actual);
    }

    @Test
    void removeNode() {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        boolean expected = false;
        boolean actual = true;

        list.append(60);
        list.removeNode(60);

        if (list.size() == 0) {
            expected = true;
        }

        assertEquals(expected, actual);
    }

    @Test
    void searchList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);

        boolean expected = true;
        boolean actual = list.searchList(2);
        assertEquals(expected, actual);
    }

    @Test
    void printList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);

        String expected = "1 -> 2 -> 3";
        String actual = list.printList();
        assertEquals(expected, actual);
    }

    @Test
    void size() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);

        int expected = 3;
        int actual = list.size();
        assertEquals(expected, actual);
    }
}