package gr.aueb.cf.ch19_generics_collections.doubly_linked_list;

/**
 * A doubly linked list implementation.
 * @param <T> the type of the elements in the list
 */
public class DoublyLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    /**
     * Time complexity O(1)
     * @param t the value to be inserted
     */
    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (head == null) tail = tmp;
        else head.setPrev(tmp);

        head = tmp;
    }

    /**
     * Time-complexity O(1)
     * @param t  the value to be inserted
     */
    public void insertLast(T t) {
        if (head == null) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }

    /**
     * Time-complexity O(1)
     * @return the last node of the list
     */
    public Node<T> removeFirst() {
        Node<T> nodeToReturn;

        if (isEmpty()) return null;

        nodeToReturn = head;
        if (head.getNext() == null) tail = null;
        head = head.getNext();
        head.setPrev(null);
        return nodeToReturn;
    }

    /**
     * Time-complexity O(1)
     * @return the last node of the list
     */
    public Node<T> removeLast() {
        Node<T> nodeToReturn;

        if(isEmpty() || head.getNext() == null) {
            return removeFirst(); //if there is only one node in the list we remove it
        }
        nodeToReturn = tail; //tail is the last node which we want to remove
        tail = tail.getPrev(); //we set the tail to the previous node
        tail.setNext(null); //we set the next of the new tail to null
        return nodeToReturn;
    }

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;
        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }

        return nodeToReturn;
    }

    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
        System.out.println();
    }

    /**
     * Time-complexity O(n)
     * Traverses the list in reverse order.
     * This method starts from the tail and goes to the head.
     */
    public void traverseReverse() {
        for (Node<T> n = tail; n != null; n = n.getPrev()) {
            System.out.println(n.getItem());
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
