package QueueDemo.LinkedListBasedQueue;

public class Main {
    public static void main(String[] args) {
        LinkedListBasedQueue queue = new LinkedListBasedQueue();
        System.out.println("Linked List-Based Queue:");

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        queue.displayQueue();

        System.out.println("Dequeued element: " + queue.dequeue());
        queue.displayQueue();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
