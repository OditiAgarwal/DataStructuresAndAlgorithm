public class ArrayQueue {
    private int front, rear, capacity;
    private int[] queue;
    //Oditi agarwal 22csu125

    public ArrayQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        queue[rear] = item;
        System.out.println(item + " enqueued to the queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return some default value or throw an exception
        }
        int item = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return item;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    } public boolean isEmpty() {
        return front == -1;
    } public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return some default value or throw an exception
        }
        return queue[front];
    } public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
System.out.println("Front element is: " + queue.peek());
System.out.println(queue.dequeue() + " dequeued from the queue");
System.out.println("Front element is: " + queue.peek());
queue.enqueue(50);

        System.out.println("Is queue full? " + queue.isFull());

        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println(queue.dequeue() + " dequeued from the queue");
        System.out.println(queue.dequeue() + " dequeued from the queue");

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
