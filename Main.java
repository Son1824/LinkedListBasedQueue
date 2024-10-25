package QueueDemo.LinkedListBasedQueue;

public class Main {
    public static void main(String[] args) {
        LinkedListBasedQueue linkedListQueue = new LinkedListBasedQueue();
        System.out.println("Linked List-Based Queue:");

        linkedListQueue.enqueue(4);
        linkedListQueue.enqueue(5);
        linkedListQueue.enqueue(6);

        linkedListQueue.displayQueue();

        System.out.println("Dequeued element: " + linkedListQueue.dequeue());
        linkedListQueue.displayQueue();

        System.out.println("Is queue empty? " + linkedListQueue.isEmpty());
    }
}
