package Implementation;

import java.util.NoSuchElementException;

public class LL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    // isEmpty() = Funtion to check if the linked list is empty or not !!
    private boolean isEmpty() {
        return first == null;
    }

    // addLast() = Function to add an element at the end of the linkedlist !!
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    // addFirst() = Function to add an element at the starting of the linkedlist !!
    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    // indexOf() = Function to find the index of the element in a linkedlist !!
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;

        }
        return -1;
    }

    // contains() = Function to check if an element exists in the linked list or not
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    // removeFirst() = Function to remove the first element of a linked list !!
    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }

    // removeLast() = Function to remove the last element of a linked list !!
    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }

}
