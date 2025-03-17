class TheQueue {
    private Node front;
    private Node end;

    public TheQueue() {
        front = null;
        end = null;
    }
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (end == null) {
            front = newNode;
            end = newNode;
        } else {
            end.setNext(newNode);
            end = newNode;
        }
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1; // Indicates an empty queue
        }
        int removedData = front.getData();
        front = front.getNext();
        if (front == null) {
            end = null;
        }
        System.out.println("Dequeued: " + removedData);
        return removedData;
    }
    public void traverse() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        System.out.print("Queue elements: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void printQueue() {
        traverse();
    }
}