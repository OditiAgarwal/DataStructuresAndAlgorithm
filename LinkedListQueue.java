import java.util.LinkedList;

public class LinkedListQueue<T>{
    private LinkedList<T> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.add(item);
        System.out.println(item + " enqueued to the queue");
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null; 
        }
        return queue.removeFirst();
    }

    public boolean isFull() {
 return false;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null; 
        }
        return queue.getFirst();
    }
 public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());

        System.out.println(queue.dequeue() + " dequeued from the queue");

        System.out.println("Front element is: " + queue.peek());

        queue.enqueue(40);

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
