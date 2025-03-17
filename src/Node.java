class Node {
    private int data;
    private Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // Getter for data
    public int getData() {
        return data;
    }

    // Setter for data
    public void setData(int data) {
        this.data = data;
    }

    // Getter for the next node
    public Node getNext() {
        return next;
    }

    // Setter for the next node
    public void setNext(Node next) {
        this.next = next;
    }
}
