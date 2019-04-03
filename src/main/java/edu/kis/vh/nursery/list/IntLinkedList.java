package edu.kis.vh.nursery.list;

class Node {

    private int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        setValue(i);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public edu.kis.vh.nursery.list.Node getPrev() {
        return prev;
    }

    public edu.kis.vh.nursery.list.Node getNext() {
        return next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class IntLinkedList {

    private Node last;

    /**
     * Added Node to IntLikedList
     *
     * @param i value of Node that will be the last element on the list
     */
    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    /**
     * Method checks IntLikedList content
     *
     * @return true if IntLikedList is empty, or false if it is empty
     */
    public boolean isEmpty() {
        return getLast() == null;
    }

    /**
     * Method checks i
     *
     * @return always return false
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Method gets top element of IntLikedList and do not remove it
     *
     * @return value of last element of IntLikedList or -1 if it is empty
     */
    public int top() {
        if (isEmpty())
            return -1;
        return getLast().getValue();
    }

    /**
     * Method gets top element of IntLikedList removes it from IntLinkList
     *
     * @return vale of last element of IntLikedList or -1 if  it is empty
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    /**
     * Method gets last Node value of IntLikedList
     *
     * @return last node  value of IntLikedList
     */
    public Node getLast() {
        return last;
    }

    /**
     * Method set last param to the last field
     * @param last Node class instance
     */
    public void setLast(Node last) {
        this.last = last;
    }


}
