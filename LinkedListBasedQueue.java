package QueueDemo.LinkedListBasedQueue;

public class LinkedListBasedQueue {
    private Node front;
    private Node rear;

    public LinkedListBasedQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            System.out.println("Enqueued: " + value);
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeuedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Current Queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
