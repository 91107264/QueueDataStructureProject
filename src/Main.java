import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
        TheQueue myqueue = new TheQueue();

        myqueue.enqueue(10);
        myqueue.enqueue(20);
        myqueue.enqueue(30);
        myqueue.enqueue(303);

        myqueue.printQueue();

        myqueue.dequeue();
        myqueue.dequeue();
        myqueue.printQueue();
    }
}

