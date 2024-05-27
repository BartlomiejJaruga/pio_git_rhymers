package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
    }

    /**
     * Gets the value of Node.
     * @return value of Node
     */
    public int getValue(){
        return this.value;
    }

    /**
     * Gets the previous Node class.
     * @return previous Node class
     */
    public Node getPrev(){
        return prev;
    }

    /**
     * Sets the previous Node to prev.
     * @param prev Node class which is going to be set as previous Node
     */
    public void setPrev(Node prev){
        this.prev = prev;
    }

    /**
     * Gets the next Node class.
     * @return next Node class
     */
    public Node getNext(){
        return next;
    }
    /**
     * Sets the next Node to prev.
     * @param next Node class which is going to be set as next Node
     */
    public void setNext(Node next){
        this.next = next;
    }

}
